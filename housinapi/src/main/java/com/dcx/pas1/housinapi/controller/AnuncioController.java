package com.dcx.pas1.housinapi.controller;

import com.dcx.pas1.housinapi.model.Anuncio;
import com.dcx.pas1.housinapi.repository.AnunciosRepository;
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
@RequestMapping("/v1/api/anuncios")
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
