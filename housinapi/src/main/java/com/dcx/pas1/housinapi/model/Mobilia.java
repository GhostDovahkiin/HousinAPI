package com.dcx.pas1.housinapi.model;

import javax.persistence.Embeddable;
import io.swagger.annotations.ApiModelProperty;


@Embeddable
public class Mobilia {
  @ApiModelProperty(value = "Tem fogão?",example = "true")
  private boolean hasFogao;

  @ApiModelProperty(value = "Tem geladeira?",example = "true")
  private boolean hasGeladeira;

  @ApiModelProperty(value = "Tem televisão?",example = "true")
  private boolean hasTv;
 
  
  @ApiModelProperty(value = "Tem internet?",example = "true")
  private boolean hasInternet;

  @ApiModelProperty(value = "Tem microondas?",example = "false")
  private boolean hasMicroondas;

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

}
