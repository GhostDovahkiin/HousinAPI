package com.dcx.pas1.housinapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "casa")
public class Casa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoCasa;

    @NotNull
    private int quantMoradores;

    @NotNull
    @OneToOne
    @JoinColumn(name = "codigo_especificacoes")
    private Especificacoes especificacoes;

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
