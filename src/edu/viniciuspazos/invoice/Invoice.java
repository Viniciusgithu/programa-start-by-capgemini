package edu.viniciuspazos.invoice;

public class Invoice {

  private int numeroItem;
  private String itemDescricao;
  private int qtdComprada;
  private float precoItem;

  Invoice(int numeroItem, String itemDescricao, int qtdComprada, float precoItem) {
    this.setNumeroItem(numeroItem);
    this.setItemDescricao(itemDescricao);
    this.setqtdComprada(qtdComprada);
    this.setPrecoItem(precoItem);

  }

  public double getInvoiceAmount() {
    return qtdComprada * precoItem;
  }

  public void setNumeroItem(int numeroItem) {
    this.numeroItem = numeroItem;
  }

  public void setItemDescricao(String itemDescricao) {
    this.itemDescricao = itemDescricao;
  }

  public String getItemDescricao() {
    return itemDescricao;
  }

  public void setqtdComprada(int qtdComprada) {

    if (qtdComprada < 0) {
      System.out.println("Valor da compra não pode ser negativa");
      this.qtdComprada = 0;
    } else {
      this.qtdComprada = qtdComprada;
    }
  }

  public int getQtdComprada() {
    return qtdComprada;
  }

  public void setPrecoItem(float precoItem) {
    if (precoItem < 0) {
      this.precoItem = 0;
    } else {
      this.precoItem = precoItem;
    }
  }

  public float getPrecoItem() {
    return precoItem;
  }

}
