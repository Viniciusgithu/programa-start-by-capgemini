package edu.viniciuspazos.exerciseColegio;

import java.util.Arrays;
import java.util.Scanner;


public class App {
  
  public static void main(String[] args) {
    
    Scanner leitor = new Scanner(System.in);

    System.out.print("Quantas notas, você quer calcular? ");

    int qtdeNotas = leitor.nextInt();

    double[] notas = new double[qtdeNotas];

    for(int i = 0; i < notas.length; i++){
      System.out.println("Informe as notas: " + (i + 1) + ":");
      notas[i] = leitor.nextDouble();
    }

    double totalMedia = 0;

    for(double nota: notas){
      totalMedia += nota;
    }

    System.out.println(Arrays.toString(notas));
    System.out.println("A média do aluno é: " + (totalMedia / notas.length));

    leitor.close();



  }



}
