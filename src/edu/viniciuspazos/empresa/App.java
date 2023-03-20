package edu.viniciuspazos.empresa;

import java.util.Date;


public class App {
  
  public static void main (String[] args) {
      
    Vendedor salesMan = new Vendedor();
    
    salesMan.setNome("Guilherme");
    salesMan.setSalario(1500.0f);
    salesMan.setCpf("54120365057");
    salesMan.setDataNascimento(new Date());

    salesMan.setComissaoPorItem(15);
    salesMan.setTotalItensVendidos(10);
    System.out.println("De acordo com as vendas e a comissão, o salário do vendedor é de: " + salesMan.calcularSalario());

  }


}
