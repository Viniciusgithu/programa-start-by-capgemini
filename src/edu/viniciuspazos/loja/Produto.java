package edu.viniciuspazos.loja;

public class Produto {
  
  String nomeProduto;
  double preco;
  static double desconto = 0.25;
  
  double precoComDesconto(){
    return preco * (1 - desconto);
  }





}
