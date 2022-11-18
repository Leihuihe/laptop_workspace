/*
 * 
 * DieAverage.java -> L5-4: 
 *
 */

// use (import) the Die class from the included JF 5 code

public class DieAverage
{

	public static void main(String[] args)
	{
		// read int numberOfRolls
		// create Die object
		// initialize int accumulator sum to 0
		// roll Die numberOfRolls times:
		// add next roll to sum
		//
		// compute and print avg roll == sum / numberOfRolls
		StdOut.println("Enter the numbers of rolls");
		int numberOfRolls = StdIn.readInt();
		Die die = new Die();
//		StdOut.println(die);
		int sum = 0;
		for(int i = 0; i < numberOfRolls; i++)
		{
			sum += die.roll();
		}
		StdOut.printf("The average of %d rolls is %.3f",numberOfRolls,sum*1.0/numberOfRolls);
	}

}
