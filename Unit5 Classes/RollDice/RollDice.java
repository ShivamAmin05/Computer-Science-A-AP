
//********************************************************************
//  RollDice.java       Author: Lewis/Loftus/Cocking
//
//  Program that allows the user to roll a die of any number of sides
//********************************************************************
import java.util.Scanner;

public class RollDice {
  // --------------------------------------------------------------
  // Gets the # of sides from the user and returns it
  // --------------------------------------------------------------
  private int getChoice() {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many sides should the dice have?(4-20)");
      
    return scan.nextInt();
  }

  // --------------------------------------------------------------
  // Makes a roll and displays the result to the user.
  // --------------------------------------------------------------
  private void rollAndDisplay(int sides) {
    Die die;
    die = new Die(sides);
    // additional code goes here
    System.out.println("Your roll is a " + die.roll());
  }

  // --------------------------------------------------------------
  // Allows the user to roll a die with the number of sides
  // they specify
  // --------------------------------------------------------------
  public void run() {
    System.out.println("This program allows you to roll a die of" +
        " any number of sides");
    int sides = getChoice();
    rollAndDisplay(sides);
  }
}
