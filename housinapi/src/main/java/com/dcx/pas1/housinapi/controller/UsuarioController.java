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
import com.dcx.pas1.housinapi.repository.UsuarioRepository;
import com.dcx.pas1.housinapi.model.Usuario;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<?> getUsuarios(){
    List<Usuario> usuarios = usuarioRepository.findAll();
    return !usuarios.isEmpty() ? ResponseEntity.ok(usuarios) : ResponseEntity.noContent().build();
  }
	
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Usuario> criar(@Valid @RequestBody Usuario usuario, HttpServletResponse response) {
		Usuario usuariosalvos = usuarioRepository.save(usuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(usuariosalvos.getCodigo()).toUri();
			response.setHeader("Location", uri.toASCIIString());
			
			return ResponseEntity.created(uri).body(usuariosalvos);
	}
	
	@GetMapping("/{codigo}")
  @ResponseStatus(HttpStatus.FOUND)
  public Usuario buscarPeloCodigo(@PathVariable Long codigo) {
    return usuarioRepository.findById(codigo)
      .orElseThrow(() -> new EntityNotFoundException());
	}
	
}
