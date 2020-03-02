package com.dcx.pas1.housinapi.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
    @ApiModelProperty(value = "Logradouro do endereço",example = "Avenida")
    private String logradouro;
    
    @ApiModelProperty(value = "Número da casa", example = "755")
    private String numero;    
    
    @ApiModelProperty(value = "Bairro do endereço", example = "Centro")
    private String bairro;

    @ApiModelProperty(value = "Cep do endereço", example = "58297000")
    private String cep;

    @ApiModelProperty(value = "Cidade do endereço", example = "Rio Tinto")
    private String cidade;

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
