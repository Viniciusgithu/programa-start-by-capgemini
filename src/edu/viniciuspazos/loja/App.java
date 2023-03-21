package edu.viniciuspazos.loja;

public class App {
  
  public static void main(String[] args) {
    
    Produto p = new Produto();

    p.nomeProduto = "Café";
    p.preco = 10;
    p.desconto = 0.50;

    System.out.println(p.precoComDesconto());   


  }





}
