package edu.viniciuspazos.challengeSmartTv;

public class Usuario {
  
  public static void main (String[] args){

    SmartTv smartTv = new SmartTv();

    for(int i = 0; i <= 9; i++ ){
      smartTv.aumentarVolume();
    }

    System.out.println("A TV está em qual volume?" + " " + smartTv.volume);



  }


}
