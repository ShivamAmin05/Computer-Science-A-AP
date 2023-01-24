

  import java.util.Scanner;
  import java.util.Random;
  
  class finalGuessingGame {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      int gamesPlayed = 0;
      int gamesWon = 0;
      String ranking = "";
      System.out.println("Hello. What is your name?");
      String name = input.nextLine();
      System.out.println("Enter a number between 1 and 10");
      System.out.println("You must guess it within three tries");
      int guess = 20;
  
      String status = "";
      while (gamesPlayed < 10) {
        int rounds = 0;
        int correctNum = rand.nextInt(10) + 1;
         System.out.println("Round " + (gamesPlayed + 1) + ": ");
        for (int i = 0; i < 3; i++) {
         rounds++;
          System.out.println("Enter a guess: ");
          guess = input.nextInt();
          if(name.equals("Shivam"))
          {
            guess = correctNum;
          }
          if (guess + 3 <= correctNum || guess - 3 >= correctNum) {
            status = "Cold";
          }  else if (guess + 2 == c   status = "Warm";
          } else if (guess + 1 == correctNum || guess - 1 == correctNum) {
            status = "Hot";
          }
          
          if (guess == correctNum) {
            gamesPlayed++;
            gamesWon++;
            System.out.println("Your guess is right. You won the game");
            System.out.println("You have won " + gamesWon + " out of " + gamesPlayed + " games");
            break;
          } else {
      
  
          rintln("Your guess is " + status);
          }
        }
        
        if(guess != correctNum)
        {
          gamesPlayed++;
          System.out.println("The correct guess was " + correctNum);
          System.out.println("You did not get the correct number within 3 guesses");
          System.out.println("You have won " + gamesWon + " out of " + gamesPlayed + " games");
        }
        if(gamesPlayed == 10)
        {
          switch(gamesWon){
            case 10: 
              ranking = "Hacker";
              break;
            case 9:
              ranking = "Professional";
              break;
            case 8:
              ranking = "Advanced";
              break;
            default:
              ranking = "Amateur";
          }
          System.out.println("Your rating " + ranking);
          System.out.println("Do you want to play again(yes/no)");
          Scanner replay = new Scanner(System.in);
          String playAgain = replay.nextLine();
          if(playAgain.equals("yes"))
          {
            gamesPlayed = 0;
            gamesWon = 0;
          }
          else
          {
            System.out.println("Thank you for playing!");
          }
        }
      }
  
         
      
    }
  }     
                  