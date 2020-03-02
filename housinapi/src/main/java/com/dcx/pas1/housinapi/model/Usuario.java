package com.dcx.pas1.housinapi.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="usuario")
public class Usuario {

  @ApiModelProperty(value = "Código do usuário",example = "1")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long codigo;
  
  @ApiModelProperty(value = "Tipo de usuário", example = "Locador")
  @NotNull
  private String tipo;

  @ApiModelProperty(value = "Nome do usuário", example = "Hanna")
  @NotNull
  private String nome;

  @ApiModelProperty(value = "CPF do usuário", example = "1338449888-00")
  @NotNull
  private String cpf;

  @NotNull
  private String datanascimento;

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getdatanascimento() {
    return datanascimento;
  }

  public void setdatanascimento(String datanascimento) {
    this.datanascimento = datanascimento;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Usuario other = (Usuario) obj;
    if (codigo == null) {
      if (other.codigo != null)
        return false;
    } else if (!codigo.equals(other.codigo))
      return false;
    return true;
  }
}