package edu.viniciuspazos.challengeSmartTv;

public class SmartTv {

  boolean ligada = false;
  int canal = 13;
  int volume = 15;


  public void aumentarVolume(){
    System.out.println("Volume atual: "+ volume);
    volume++;
    System.out.println("Volume aumentou para: " + volume);
  }

  public void diminuirVolume(){
    System.out.println("Volume atual: "+ volume);
    volume--;
    System.out.println("Volume diminuiu para: "+ volume);
    
  }

}
