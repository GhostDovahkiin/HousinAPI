package com.dcx.pas1.housinapi.controller;

import com.dcx.pas1.housinapi.model.Usuario;
import com.dcx.pas1.housinapi.repository.UsuarioRepository;
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
@RequestMapping("/v1/api/usuarios")
public class UsuarioController {

  private final String json = "application/json";

  @Autowired
  private UsuarioRepository usuarioRepository;


  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Retorna todos os usuários cadastrados"),
    @ApiResponse(code = 204, message = "Não há usuários cadastrados")
})
  @ApiOperation(value = "Retorna todas os usuários cadastrados no sistema.", response = Iterable.class, produces = json)
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<?> getUsuarios(){
    List<Usuario> usuarios = usuarioRepository.findAll();
    return !usuarios.isEmpty() ? ResponseEntity.ok(usuarios) : ResponseEntity.noContent().build();
  }
  
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Cadastra um novo usuário")
})
  @ApiOperation(value = "Cadastra um novo usuário", response = Iterable.class, produces = json)
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Usuario> criar(@Valid @RequestBody Usuario usuario, HttpServletResponse response) {
		Usuario usuariosalvos = usuarioRepository.save(usuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(usuariosalvos.getCodigo()).toUri();
			response.setHeader("Location", uri.toASCIIString());
			
			return ResponseEntity.created(uri).body(usuariosalvos);
	}
  
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Retorna um usuário específico pelo código"),
    @ApiResponse(code = 204, message = "Usuário não cadastrado")
})
  @ApiOperation(value = "Retorna um usuário específico pelo seu código", response = Iterable.class, produces = json)
	@GetMapping("/{codigo}")
  @ResponseStatus(HttpStatus.FOUND)
  public Usuario buscarPeloCodigo(@PathVariable Long codigo) {
    return usuarioRepository.findById(codigo)
      .orElseThrow(() -> new EntityNotFoundException());
  }
  

  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Remove usuário pelo código"),
    @ApiResponse(code = 204, message = "Usuário não encontrado")
})
  @ApiOperation(value = "Remove o usuário pelo código", response = Iterable.class, produces = json)
  @DeleteMapping("/{codigo}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void removerPeloCodigo(@PathVariable Long codigo){
    usuarioRepository.deleteById(codigo); 
      
  }

  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Atualiza as informações de um usuário.")
})
  @ApiOperation(value = "Atualiza as informações de um usuário.", response = Iterable.class, produces = json)
  @PutMapping("/{codigo}")
  public ResponseEntity<Usuario> atualizarUsuario(@PathVariable Long codigo, @RequestBody Usuario usuario){
    Usuario usuariosalvo = usuarioRepository.findById(codigo)
    .orElseThrow(() -> new EntityNotFoundException());
    BeanUtils.copyProperties(usuario, usuariosalvo, "codigo");
    usuarioRepository.save(usuariosalvo);
    return ResponseEntity.ok(usuariosalvo);
  }
	
}
