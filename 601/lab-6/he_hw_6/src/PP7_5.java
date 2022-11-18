
/*
 * 
 *   PP7_5.java -> H6-3
 *
 */

public class PP7_5
{
	
	public static void main(String[] args)
	{
		// create int[] numbers to hold input integers
		
		int[] numbers = new int[50]; // no more than 50
		
		// how many ints to enter?
		
		StdOut.print("Enter number of integers to process: ");
		
		int howMany = StdIn.readInt();
		
		for (int index=0; index < howMany; index++)
		{
			StdOut.print("Enter next int: ");
			int nextNum = StdIn.readInt();
			
			// now you store nextNum in numbers[index]
		}
		
		// compute sum of all values in numbers[0..howMany-1]
		
		// compute and print mean = previous sum / howMany
		
		// compute sum of (mean-numbers[index]) squared
		
		// finish computation of std deviation and print
		

	}

}
