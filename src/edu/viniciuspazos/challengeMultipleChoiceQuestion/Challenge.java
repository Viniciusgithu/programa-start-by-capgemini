package edu.viniciuspazos.challengeMultipleChoiceQuestion;

import java.util.Scanner;

public class Challenge {
  
  public static void main (String[] args){

    Scanner leitor = new Scanner(System.in);

    String question = "You want to represent how many pounds your suitcase weights, including several decimal points, in a Java program. What data type should you use?";

    String choiceOne = "char";
    String choiceTwo = "int";
    String choiceThree = "double";
    String choiceFour = "boolean";
    String correctAnswer = choiceThree;

    System.out.println(question);
    System.out.println("Choose one of the following: " + choiceOne + "," + choiceTwo + "," + choiceThree + "," + choiceFour);

    String input = leitor.next();

    if (correctAnswer.equals(input)) {
      System.out.println("Congrats! That's the correct answer!");
    } else {
      System.out.println("You are incorrect. The correct answer is: " + correctAnswer);
    }

  }


}
