package elementos;

public abstract class Produto {
  private String compradoEm, filial, identificador;
  
  Produto(String compradoEm, String filial, String identificador) {
    this.compradoEm = compradoEm;
    this.filial = filial;
    this.identificador = identificador;
  }

  public String getCompradoEm() {
    return this.compradoEm;
  }

  public String getFilial() {
    return this.filial;
  }

  public String getIdentificador() {
    return this.identificador;
  }
}
