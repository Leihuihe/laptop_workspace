import jf5.Die;

/*
 * 
 * PP5_10.java -> L5-5 
 *
 */

public class PP5_10
{
	// this is copied from SnakeEyes.java...

	// -----------------------------------------------------------------
	// Creates two Die objects and rolls them several times, counting
	// the number of snake eyes that occur.
	// -----------------------------------------------------------------
	public static void main(String[] args)
	{
		final int ROLLS = 50000;
		int num1, num2, count = 0;

//		Die die1 = new Die();
//		Die die2 = new Die();
		
		PairOfDice pdice = new PairOfDice();
		for (int roll = 1; roll <= ROLLS; roll++)
		{
//			num1 = die1.roll();
//			num2 = die2.roll();
			pdice.roll();
//			if(pdice.getCurrentSum() == 2)
			if (pdice.getDie1Value() == 1 && pdice.getDie2Value() == 1) // check for snake eyes
				count++;
		}

		System.out.println("Number of rolls: " + ROLLS);
		System.out.println("Number of snake eyes: " + count);
		System.out.println("Ratio: " + (float) count / ROLLS);
		System.out.println(1.0 / 36.0);
	}

}
