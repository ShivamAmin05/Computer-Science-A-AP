
//********************************************************************
//  Die.java       Author: Lewis/Loftus/Cocking
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and the number of faces on the die.
//********************************************************************
import java.util.Random;

public class Die
{
	private final int MIN_FACES = 4;
	private static Random generator = new Random();
	private int numFaces; // number of sides on the die
	private int faceValue; // current value showing on the die
	// -----------------------------------------------------------------
	// Defaults to a six-sided die. Initial face value is 1.
	// -----------------------------------------------------------------

	public Die()
	{
		faceValue = 1;
		numFaces = 6;
	}

	// -----------------------------------------------------------------
	// Explicitly sets the size of the die. Defaults to a size of
	// six if the parameter is invalid. Initial face value is 1.
	// -----------------------------------------------------------------
	public Die(int faces) 
	{
		faceValue = 1;
		// faces = rd.getChoice();
		if (faces < MIN_FACES) 
		{
			numFaces = 6;
		} else {
			numFaces = faces;
		}
	}

	// -----------------------------------------------------------------
	// Rolls the die by using random num generator and returns the result.
	// -----------------------------------------------------------------
	public int roll() 
	{
		return generator.nextInt(numFaces) + 1;
	}

	// -----------------------------------------------------------------
	// Returns the current die value.
	// -----------------------------------------------------------------
	public int getFaceValue()
	{
		return roll();
	}
}