package com.dcx.pas1.housinapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Column
    @NotNull
    private String logradouro;

    @Column
    @NotNull
    private String cidade;

    @Column
    @NotNull
    private String cep;

    @Column
    @NotNull
    private String estado;

}
