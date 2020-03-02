package com.dcx.pas1.housinapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
@Entity
@Table(name = "anuncio")
public class Anuncio {

    @ApiModelProperty(value = "Código do anúncio")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoAnuncio;

    @ApiModelProperty(value = "Descrição do anúncio",example = "Casa disponível para dois moradores" )
    @Column
    @NotNull
    private String descricao;

    @OneToOne
    @NotNull
    @JoinColumn(name="codigo_casa")
    private Casa casa;

    @NotNull
    @ManyToOne
    @JoinColumn(name="codigo_usuario")
    private Usuario usuario;

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getCodigo() {
        return codigoAnuncio;
      }
}
