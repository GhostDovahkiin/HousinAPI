package com.dcx.pas1.housinapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "especificacoes")
public class Especificacoes {

    private List<String> mobilia;

    private List<String> comodos;

}
