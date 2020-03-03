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
    private int quantQuartos;

    @NotNull
    private int quantBanheiros;

    @NotNull
    private boolean hasGaragem;

    @NotNull
    private boolean hasFogao;

    @NotNull
    private boolean hasGeladeira;

    @NotNull
    private boolean hasTv;

    @NotNull
    private boolean hasInternet;

    @NotNull
    private boolean hasMicroondas;

    @NotNull
    private String logradouro;

    @NotNull
    private String numero;

    @NotNull
    private String bairro;

    @NotNull
    private String cep;

    @NotNull
    private String cidade;

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

    public boolean isHasFogao() {
        return hasFogao;
    }

    public void setHasFogao(boolean hasFogao) {
        this.hasFogao = hasFogao;
    }

    public boolean isHasGeladeira() {
        return hasGeladeira;
    }

    public void setHasGeladeira(boolean hasGeladeira) {
        this.hasGeladeira = hasGeladeira;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }

    public boolean isHasInternet() {
        return hasInternet;
    }

    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }

    public boolean isHasMicroondas() {
        return hasMicroondas;
    }

    public void setHasMicroondas(boolean hasMicroondas) {
        this.hasMicroondas = hasMicroondas;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
