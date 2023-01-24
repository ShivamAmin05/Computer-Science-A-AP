import java.util.Scanner;
import java.util.Random;

class slotMachine {
  private static int points = 50;
  public static final String orgCol = "\u001B[0m";
  public static final String yellow = "\u001B[0m";
  public static final String blue = "\u001B[34m";
  public static final String purple = "\u001B[35m";
  public static final String cyan = "\u001B[36m";
  public static final String green = "\u001B[32m";
  
  
  public static void main(String[] args) {
    System.out.println("Welcome to the Slot Machine!");
    System.out.println("You have 50 points");
    System.out.println("Rules:");
    
    System.out.println("Each pull of the slot machine takes - 5 points");
    System.out.println("If you pull 2 of the same numbers - 20 points");
    System.out.println("If you pull 3 of the same numbers - 30 points");
    System.out.println("If you pull 3 ascending numbers - 777 points");
    System.out.println("If you pull 3 of 7s - JACKPOT - 777 points");
    Spin();
    System.out.println("You have finished with" + points + "points. Thank you for playing!");
  }
  private static void pause(int ms) {
	 try {
		 Thread.currentThread().sleep(ms);
	 } catch (InterruptedException e) {
	 }
 }
  private static void Animation()
  {
    for(int i = 1; i < 10;i++)
      {
        System.out.println("_______");
        System.out.println("| |" + i + "|" + " |");
        System.out.println(" ͞ ͞ ͞ ͞ ͞ ͞ ͞");
        pause(250);
      }
        System.out.println("_______");
        System.out.println("| | | |");
        System.out.println(" ͞ ͞ ͞ ͞ ͞ ͞ ͞");
        pause(1500);
  }
  private static void Spin() {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int gameOver = 1;
    while (gameOver != 2 && points != 0) {
      System.out.println("Press 1 to Spin or 2 to quit:");
      gameOver = input.nextInt();
      if(gameOver == 2)
      {
        break;
      }
      points -= 5;
      int firstNum = rand.nextInt(10);
      int secondNum = rand.nextInt(10);
      int thirdNum = rand.nextInt(10);
      System.out.println("Spinning");
      Animation();
      System.out.println(cyan + "_______" + orgCol);
      System.out.println("|" + cyan + firstNum + orgCol + "|" + "|" + cyan + secondNum + orgCol + "|" + "|" + cyan + thirdNum + orgCol + "|");
      System.out.println(cyan + " ͞ ͞ ͞ ͞ ͞ ͞ ͞" + orgCol);
      Match(firstNum, secondNum, thirdNum);
      System.out.println("You have " + points + " points");
    }
  }
  private static void Match(int numOne, int numTwo, int numThree) {
    if(numOne == 7 && numTwo == 7 && numThree == 7)
    {
      System.out.println(yellow + "You have won the jackpot! Win 100 points!");
      points += 777;
      return;
    }
    if(numOne == numTwo || numTwo == numThree || numThree == numOne)
    {
      System.out.println(blue + "You have won two of a kind! Win 20 points!" + orgCol);
      points += 20;
      return;
    }
    if(numOne == numTwo && numTwo == numThree && numThree == numOne)
    {
      System.out.println(purple + "You have won three of a kind! Win 30 points!");
      points += 30;
      return;
    }
    if(numOne + 1 == numTwo && numTwo + 1 == numThree && numThree - 2 == numOne)
    {
      System.out.println(green + "You have ascending order! Win 123 points!");
      points += 123;
      return;
    }
    else
    {
      System.out.println("You have won no matches.");
    }
  }
} 


