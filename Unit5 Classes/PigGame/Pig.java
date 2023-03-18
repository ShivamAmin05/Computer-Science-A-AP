public class Pig {
	private int goal;
	private PairOfDice dice;
	private PigPlayer computer, player1, player2, currentPlayer;
  
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

	// Your constructor, sets up the game
	public Pig(int target)
	{
		goal = target;
		dice = new PairOfDice();
		computer = new PigPlayer(20);
		player1 = new PigPlayer(100);
		player2 = new PigPlayer(100);
	}

	// This method contains the primary game loop, which terminates only once a
	// player has won the game
	public void play()
	{
		boolean noWinnerYet = true;
		currentPlayer = computer;
    System.out.println("Welcome to Pig Game the computer will roll first");
		System.out.println("Computer's turn");
		do {
			takeTurn();
			// code to take turns and check points
			if (currentPlayer.getPoints() >= goal)
			{
				noWinnerYet = false;
			}
			else if (currentPlayer == computer)
			{
				currentPlayer = player1;
				System.out.println("Player 1's turn");
			}
			else if (currentPlayer == player1)
			{
				currentPlayer = player2;
				System.out.println("Player 2's turn");
			}
			else if (currentPlayer == player2)
			{
				currentPlayer = computer;
				System.out.println("Computer's turn");
			}
		} while (noWinnerYet);
		announceWinner();
	}

	// Plays one player's complete turn, allowing the player to roll the dice
	// multiple times
	private void takeTurn()
	{
		boolean stillRolling = true;
		// set up output to show current status of roller and opponent's scores
		System.out.println(ANSI_CYAN + "Computer has " + computer.getPoints() + " points" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Player 1 has " + player1.getPoints() + " points" + ANSI_RESET);
		System.out.println(ANSI_PURPLE + "Player 2 has " + player2.getPoints() + " points" + ANSI_RESET);	
		// get points for player1, player2 and computer
		while (stillRolling)
		{
			stillRolling =  currentPlayer.roll(dice, goal);
		}

	}

	// Announces the winner and prints the results

	private void announceWinner()
	{
		// print out who won
		// print out final points and final results
		if (currentPlayer == computer)
		System.out.println(ANSI_GREEN + "Computer won the game with " + currentPlayer.getPoints() + "points!");
		else if (currentPlayer == player1)
		System.out.println(ANSI_GREEN + "Player 1 won the game with " + currentPlayer.getPoints() + " points!");
		else if (currentPlayer == player2)
		System.out.println(ANSI_GREEN + "Player 2 won the game with " + currentPlayer.getPoints() + " points!");

	}
}