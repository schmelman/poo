package elementos;

import interfaces.*;

public class Livro extends Produto implements Vendavel {
  private String autor, editor, titulo;
  private double preco;
  private Integer tipoPagamento;

  Livro(String autor, String compradoEm, String editor, String filial, String identificador, Double preco,
      String titulo) {
    super(compradoEm, filial, identificador);
    this.autor = autor;
    this.editor = editor;
    this.preco = preco;
    this.titulo = titulo;
  }

  @Override
  public double valorVenda() {
    switch (this.formaDePagamento()) {
      case 0: // deposito em conta
        return this.valorCusto() + (this.valorCusto() * 1.10);
      case 1: // boleto
        return this.valorCusto() + (this.valorCusto() * 1.30);
      case 2: // cartão de crédito
        return this.valorCusto() + (this.valorCusto() * 1.50);
      case 3: // cartão de débito
        return this.valorCusto() + (this.valorCusto() * 1.25);
      default: // caso extremo onde não exista a forma de pagamento
        return -1;
    }
  }

  @Override
  public double valorCusto() {
    return this.preco;
  }

  @Override
  public Integer formaDePagamento() {
    return this.tipoPagamento;
  }

  public String getAutor() {
    return this.autor;
  }

  public String getEditor() {
    return this.editor;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setTipoPagamento(Integer tipo) {
    this.tipoPagamento = tipo;
  }
}
