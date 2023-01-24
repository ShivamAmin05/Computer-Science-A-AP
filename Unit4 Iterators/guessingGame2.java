import java.util.Scanner;
import java.util.Random;

class guessingGame2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int correctNum = rand.nextInt(10) + 1;
    System.out.println("Enter a number between 1 and 10");
    System.out.println("You must guess it within three tries");
    System.out.println("Enter a guess: ");
    int guess = input.nextInt();
    int guessNum = 1;
    String status = "";
    while (guess != correctNum && guessNum < 3) {
      if (guess + 3 <= correctNum || guess - 3 >= correctNum) {
        status = "Cold";
      } else if (guess + 2 == correctNum || guess - 2 == correctNum) {
        status = "Warm";
      } else if (guess + 1 == correctNum || guess - 1 == correctNum) {
        status = "Hot";
      }
      System.out.println("Your guess is " + status);
      System.out.println("Enter a guess: ");
      guess = input.nextInt();
      guessNum++;
    }
    if (guess == correctNum) {
      System.out.println("Your guess is right. You won the game");
    } else {
      System.out.println("The correct guess was " + correctNum);
      System.out.println("You did not get the correct number within 3 guesses");
    }
  }
}