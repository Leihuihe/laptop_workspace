/*
 *   RollStats.java -> h4-1
 */

import java.util.Random;

public class RollStats
{

	public static void main(String[] args)
	{
		StdOut.println("Pls. enter number of rolls");
		int numRolls = StdIn.readInt();

		int oneCount = 0; // counts # of times a 1 occurs in rolls
		int twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0, sixCount = 0;
		// etc...

		Random generator = new Random();

		for (int count = 0; count < numRolls; count++)
		{
			int randInt = 0; // fix this!
			randInt = generator.nextInt(1, 7);
			// generate next random int randInt:
			// generator.nextInt(6) + 1 // random int from 1 through 6,
			// inclusive

			// if (randInt==1) oneCount++;
			// etc...
			if (randInt==1) oneCount++;
			else if (randInt==2) twoCount++;
			else if (randInt==3) threeCount++;
			else if (randInt==4) fourCount++;
			else if (randInt==5) fiveCount++;
			else if (randInt==6) sixCount++;
		}

		// print out oneCount, twoCount, etc.
		StdOut.println("Value 1: "+oneCount+" times");
		StdOut.println("Value 2: "+twoCount+" times");
		StdOut.println("Value 3: "+threeCount+" times");
		StdOut.println("Value 4: "+fourCount+" times");
		StdOut.println("Value 5: "+fiveCount+" times");
		StdOut.println("Value 6: "+sixCount+" times");
	}

}
