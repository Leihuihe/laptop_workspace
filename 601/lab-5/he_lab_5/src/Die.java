import java.util.Random;

/*
 * 
 * from JF 5's code examples (but not in same jf5 package): Die.java
 * 
 * part of L5-4
 *
 */

public class Die
{
	private final int MAX = 6; // maximum face value

	private int faceValue; // current value showing on the die

	// -----------------------------------------------------------------
	// Constructor: Sets the initial face value.
	// -----------------------------------------------------------------
	public Die()
	{
		faceValue = 1;
	}

	// -----------------------------------------------------------------
	// Computes a new face value for this die and returns the result.
	// -----------------------------------------------------------------
	public int roll()
	{
		faceValue = (int) (Math.random() * MAX) + 1;
		Random rand = new Random();
		faceValue = rand.nextInt(1, 7);
		return faceValue;
	}

	// -----------------------------------------------------------------
	// Face value mutator. The face value is not modified if the
	// specified value is not valid.
	// -----------------------------------------------------------------
	public void setFaceValue(int value)
	{
		if (value >= 1 && value <= MAX)
			faceValue = value;
	}

	// -----------------------------------------------------------------
	// Face value accessor.
	// -----------------------------------------------------------------
	public int getFaceValue()
	{
		return faceValue;
	}

	// -----------------------------------------------------------------
	// Returns a string representation of this die.
	// -----------------------------------------------------------------
	public String toString()
	{
		String result = Integer.toString(faceValue);

		return result;
	}
}
