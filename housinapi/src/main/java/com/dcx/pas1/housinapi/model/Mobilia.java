package com.dcx.pas1.housinapi.model;

import javax.persistence.Embeddable;

@Embeddable
public class Mobilia {

  private boolean hasFogao;
  private boolean hasGeladeira;
  private boolean hasTv;
  private boolean hasInternet;
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
