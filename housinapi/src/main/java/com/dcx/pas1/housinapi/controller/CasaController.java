package com.dcx.pas1.housinapi.controller;

import com.dcx.pas1.housinapi.model.Casa;
import com.dcx.pas1.housinapi.repository.CasaRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/api/casas")
public class CasaController {

    private final String json = "application/json";
    @Autowired
    private CasaRepository casaRepository;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna as casas cadastradas"),
            @ApiResponse(code = 204, message = "Não há casas cadastradas")
    })
    @ApiOperation(value = "Retorna todas as casas cadastradas no sistema.", response = Iterable.class, produces = json)
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> recuperarCasas() {
        List<Casa> casas = casaRepository.findAll();
        return !casas.isEmpty() ? ResponseEntity.ok(casas) : ResponseEntity.noContent().build();
    }

    @ApiResponse(code = 201, message = "Casa cadastrada com sucesso")
    @ApiOperation(value = "Cria uma nova casa", consumes = json)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Casa> criarCasa(@Valid @RequestBody Casa casa, HttpServletResponse response) {
        Casa casaSalva = casaRepository.save(casa);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
                .buildAndExpand(casaSalva.getCodigoCasa()).toUri();
        response.setHeader("Location", uri.toASCIIString());

        return ResponseEntity.created(uri).body(casaSalva);
    }

    @ApiResponse(code = 302, message = "Casa encontrada")
    @ApiOperation(value = "Retorna uma casa específica pelo ID", response = Casa.class, produces = json)
    @GetMapping("/{codigo}")
    @ResponseStatus(HttpStatus.FOUND)
    public Casa buscarPeloCodigo(@PathVariable Long codigo) {
        return casaRepository.findById(codigo)
                .orElseThrow(EntityNotFoundException::new);
    }

    @ApiResponse(code = 204, message = "Casa removida com sucesso")
    @ApiOperation(value = "Remove uma casa baseada no seu ID")
    @DeleteMapping("/{codigo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaPeloCodigo(@PathVariable Long codigo) {
        this.casaRepository.deleteById(codigo);
    }

    @ApiResponse(code = 200, message = "Dados atualizados!")
    @ApiOperation(value = "Atualiza os dados de uma casa", consumes = json)
    @PutMapping("/{codigo}")
    public ResponseEntity<Casa> atualizaCasa(@PathVariable Long codigo, @Valid @RequestBody Casa casa) {
        Casa casasalvo = this.casaRepository.findById(codigo)
                .orElseThrow(EntityNotFoundException::new);
        BeanUtils.copyProperties(casa, casasalvo, "codigo");
        this.casaRepository.save(casasalvo);
        return ResponseEntity.ok(casasalvo);
    }

}
