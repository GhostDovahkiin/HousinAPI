package com.dcx.pas1.housinapi.model;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "especificacoes")
public class Especificacoes {

    @ApiModelProperty(value = "Código das especificações", example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEspecificacoes;

    @ApiModelProperty(value = "Quantidade de quartos", example = "3")
    @NotNull
    private int quantQuartos;

    @ApiModelProperty(value = "Quantidade de banheiros", example = "2")
    @NotNull
    private int quantBanheiros;

    @ApiModelProperty(value = "Tem garagem?", example = "True")
    @NotNull
    private boolean hasGaragem;

    @Embedded
    private Mobilia mobilia;

    public int getQuantQuartos() {
        return quantQuartos;
    }

    public void setQuantQuartos(int quantQuartos) {
        this.quantQuartos = quantQuartos;
    }

    public int getQuantBanheiros() {
        return quantBanheiros;
    }

    public void setQuantBanheiros(int quantBanheiros) {
        this.quantBanheiros = quantBanheiros;
    }

    public boolean isHasGaragem() {
        return hasGaragem;
    }

    public void setHasGaragem(boolean hasGaragem) {
        this.hasGaragem = hasGaragem;
    }

    public Mobilia getMobilia() {
        return mobilia;
    }

    public void setMobilia(Mobilia mobilia) {
        this.mobilia = mobilia;
    }

    public Long getCodigoEspecificacoes() {
        return codigoEspecificacoes;
    }

    public void setCodigoEspecificacoes(Long codigoEspecificacoes) {
        this.codigoEspecificacoes = codigoEspecificacoes;
    }
}
