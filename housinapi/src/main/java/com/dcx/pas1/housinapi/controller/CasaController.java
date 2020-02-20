package com.dcx.pas1.housinapi.controller;

import java.net.URI;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dcx.pas1.housinapi.repository.CasaRepository;
import com.dcx.pas1.housinapi.repository.UsuarioRepository;
import com.dcx.pas1.housinapi.model.Casa;
import com.dcx.pas1.housinapi.model.Usuario;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/casas")
public class CasaController {

  @Autowired
  private CasaRepository casaRepository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<?> getCasa(){
    List<Casa> casas = casaRepository.findAll();
    return !casas.isEmpty() ? ResponseEntity.ok(casas) : ResponseEntity.noContent().build();
  }
	
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Casa> criar(@Valid @RequestBody Casa casa, HttpServletResponse response) {
		Casa casaSalva = casaRepository.save(casa);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(casaSalva.getCodigoCasa()).toUri();
			response.setHeader("Location", uri.toASCIIString());
			
			return ResponseEntity.created(uri).body(casaSalva);
	}
	
	@GetMapping("/{codigo}")
  @ResponseStatus(HttpStatus.FOUND)
  public Casa buscarPeloCodigo(@PathVariable Long codigo) {
    return casaRepository.findById(codigo)
      .orElseThrow(() -> new EntityNotFoundException());
	}
	
}
