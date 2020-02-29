package com.dcx.pas1.housinapi.controller;

import com.dcx.pas1.housinapi.model.Anuncio;
import com.dcx.pas1.housinapi.repository.AnunciosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/api/anuncios")
public class AnuncioController {
  private final String json = "application/json";
  @Autowired
  private AnunciosRepository anuncioRepository;

  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Retorna os anúncios cadastrados"),
    @ApiResponse(code = 204, message = "Não há anúncios cadastrados")
})
  @ApiOperation(value = "Retorna todas os anúncios cadastrados no sistema.", response = Iterable.class, produces = json)
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<?> getAnuncios(){
    List<Anuncio> anuncios = anuncioRepository.findAll();
    return !anuncios.isEmpty() ? ResponseEntity.ok(anuncios) : ResponseEntity.noContent().build();
  }

	@ApiOperation(value = "Cria um novo anúncio", response = Iterable.class, produces = json)
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Anuncio> criar(@Valid @RequestBody Anuncio anuncio, HttpServletResponse response) {
		Anuncio anunciosSalvos = anuncioRepository.save(anuncio);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(anunciosSalvos.getCodigo()).toUri();
			response.setHeader("Location", uri.toASCIIString());
			
			return ResponseEntity.created(uri).body(anunciosSalvos);
  }
  
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Busca anúncio específico pelo código"),
    @ApiResponse(code = 204, message = "Não há anúncios cadastrados")
})
	@ApiOperation(value = "Busca anúncio específico pelo código", response = Iterable.class, produces = json)
	@GetMapping("/{codigo}")
  @ResponseStatus(HttpStatus.FOUND)
  public Anuncio buscarPeloCodigo(@PathVariable Long codigo) {
    return anuncioRepository.findById(codigo)
      .orElseThrow(() -> new EntityNotFoundException());
  }

  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Deleta anúncio específico pelo código")
  })
  @ApiOperation(value = "Deleta anúncio específico pelo código", response = Iterable.class, produces = json)
  @DeleteMapping("/{codigo}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deletaPeloCodigo(@PathVariable Long codigo){
    this.anuncioRepository.deleteById(codigo);
  }

  @ApiOperation(value = "Atualiza os dados de um anúncio", response = Iterable.class, produces = json)
  @PutMapping("/{codigo}")
  public ResponseEntity<Anuncio> atualizaAnuncio(@PathVariable Long codigo, @Valid @RequestBody Anuncio anuncio){
    Anuncio anunciosalvo = this.anuncioRepository.findById(codigo)
      .orElseThrow(() -> new EntityNotFoundException());
    BeanUtils.copyProperties(anuncio, anunciosalvo, "codigo");
    this.anuncioRepository.save(anunciosalvo);
    return ResponseEntity.ok(anunciosalvo);
  }
	
}
