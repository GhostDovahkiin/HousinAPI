package com.dcx.pas1.housinapi.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "casa")
public class Casa {

    @ApiModelProperty(value = "Código identificador da casa(anúncio)", example = "0")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoCasa;

    @ApiModelProperty(value = "Quantos moradores há na casa", example = "2")
    @NotNull
    private int quantMoradores;

    @ApiModelProperty(value = "Especificações da casa, como quantidade e cômodos disponíveis")
    @NotNull
    @OneToOne
    @JoinColumn(name = "codigo_especificacoes")
    private Especificacoes especificacoes;

    @ApiModelProperty(value = "Objeto de endereço da casa", example = "Rua da Alegria, 349, Mamanguape, Centro")
    @NotNull
    @Embedded
    private Endereco endereco;

    public Especificacoes getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(Especificacoes especificacoes) {
        this.especificacoes = especificacoes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQuantMoradores() {
        return quantMoradores;
    }

    public void setQuantMoradores(int quantMoradores) {
        this.quantMoradores = quantMoradores;
    }

    public long getCodigoCasa() {
        return codigoCasa;
    }

    public void setCodigoCasa(long codigoCasa) {
        this.codigoCasa = codigoCasa;
    }

    
}
