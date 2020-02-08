package com.dcx.pas1.housinapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "casa")
public class Casa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CodigoCasa;

    @OneToOne(mappedBy = "casa")
    private Anuncio anuncio;

    @Column
    @NotNull
    private Especificacoes especificacoes;

    @Column
    @NotNull
    @OneToOne
    private Endereco endereco;
}
