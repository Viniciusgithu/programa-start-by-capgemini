package edu.viniciuspazos.invoice;

public class App {
  
  public static void main(String[] args) {
    

    Invoice inv = new Invoice(1, "RAM", -2, 250f);

    System.out.println("Valor total da compra: " + inv.getInvoiceAmount());


  }


}
