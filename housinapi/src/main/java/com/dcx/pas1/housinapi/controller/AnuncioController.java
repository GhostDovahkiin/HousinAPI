package com.dcx.pas1.housinapi.controller;

import java.net.URI;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dcx.pas1.housinapi.repository.AnunciosRepository;
import com.dcx.pas1.housinapi.model.Anuncio;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/anuncios")
public class AnuncioController {

  @Autowired
  private AnunciosRepository anuncioRepository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<?> getAnuncios(){
    List<Anuncio> anuncios = anuncioRepository.findAll();
    return !anuncios.isEmpty() ? ResponseEntity.ok(anuncios) : ResponseEntity.noContent().build();
  }
	
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Anuncio> criar(@Valid @RequestBody Anuncio anuncio, HttpServletResponse response) {
		Anuncio anunciosSalvos = anuncioRepository.save(anuncio);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(anunciosSalvos.getCodigo()).toUri();
			response.setHeader("Location", uri.toASCIIString());
			
			return ResponseEntity.created(uri).body(anunciosSalvos);
	}
	
	@GetMapping("/{codigo}")
  @ResponseStatus(HttpStatus.FOUND)
  public Anuncio buscarPeloCodigo(@PathVariable Long codigo) {
    return anuncioRepository.findById(codigo)
      .orElseThrow(() -> new EntityNotFoundException());
  }
  
  @DeleteMapping("/{codigo}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deletaPeloCodigo(@PathVariable Long codigo){
    this.anuncioRepository.deleteById(codigo);
  }

  @PutMapping("/{codigo}")
  public ResponseEntity<Anuncio> atualizaAnuncio(@PathVariable Long codigo, @Valid @RequestBody Anuncio anuncio){
    Anuncio anunciosalvo = this.anuncioRepository.findById(codigo)
      .orElseThrow(() -> new EntityNotFoundException());
    BeanUtils.copyProperties(anuncio, anunciosalvo, "codigo");
    this.anuncioRepository.save(anunciosalvo);
    return ResponseEntity.ok(anunciosalvo);
  }
	
}
