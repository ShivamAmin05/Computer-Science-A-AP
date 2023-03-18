
//The PigPlayer class represents one player of the game, either player1, player2, or the computer.  
//Each player tracks his total points and the points accumulated this round.
//The player's limit is the number of points he is willing to accumulate in one round before passing to the next player.
//This is dynamic for player1 and player2
import java.util.Scanner;

public class PigPlayer {
  public final static int ASK = 0; // prompts for round termination
  private int total; // total points accumulated in game
  private int round; // points accumulated in current round
  private int limit; // pass tolerance
  private boolean rollAgain;
  private static PairOfDice dice = new PairOfDice();

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  // Initializes the point accumulators to zero, and the round limit as specified
  public PigPlayer(int max) {
    limit = max;
  }

  // Rolls the Dice once and deals with the results.
  // Returns true if the player should roll again and false otherwise.
  // The player will not roll again if he busts or wins, or if his round limit is
  // reached (computer)
  public boolean roll(PairOfDice dice, int goal) {
    boolean rollAgain = true;
    int die1;
    int die2;
    int prompt;
    round = 0;
    Scanner input = new Scanner(System.in);
    do {
      die1 = 0;
      die2 = 0;
      if (total + round > limit && limit == 100) {
        rollAgain = false;
      } else if (limit == 100) {
        System.out.println("Roll? (1 for yes, any other number for no)");
        prompt = input.nextInt();
        if (prompt != 1) {
          rollAgain = false;
        } else {
          rollAgain = true;
          die1 = dice.roll1();
          die2 = dice.roll2();
        }
      } else if (limit == 20 && round <= limit) {
        rollAgain = true;
        die1 = dice.roll1();
        die2 = dice.roll2();
      } else {
        rollAgain = false;
      }
      System.out.println(ANSI_BLUE + "Die 1: " + die1 + ANSI_RESET + ANSI_RED + "\t      Die 2: " + die2 + ANSI_RESET);
      if (die1 == 1 && die1 == die2) // check if busted in total
      {
        System.out.println("You have lost all of your points");
        rollAgain = false;
        total = 0;
        round = 0;
      } else if (die1 == 1 || die2 == 1) // check if busted for round
      {
        System.out.println("No points for you this round, next player");
        round = 0;
        rollAgain = false;
      } else if (total + round < 100) // else print out points
      {
        round += die1 + die2;
        System.out.println("You have: " + round + " points this round");

        // roll again?
      }
    } while (rollAgain == true);
    total += round;
    System.out.println("Ended the round with " + round + " points\n");
    return false;
  }

  public boolean continueRound() {
    return rollAgain;
  }

  // returns the total number of points accumulated by this player
  public int getPoints() {
    return total;
  }
}