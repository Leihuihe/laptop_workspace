import java.util.Arrays;

/*
 
 	PP7_1.java -> L7.3
 
 */

public class PP7_1
{

	public static void main(String[] args)
	{
		int[] counter = new int[51]; // 0..50 for legal subscripts
		int number = 1; // just to enter the while

		while (true)
		{
			number = StdIn.readInt();
			if(number < 0 || number > 50)
				break;
			counter[number]++;
			// process it! we'll do a clever array hack in class...
		}
		for(int num: counter)
		{
			StdOut.print(num+" ");
		}
		StdOut.println();
		StdOut.println(Arrays.toString(counter));
		// print out all numbers in counter that have counts of at least 1...

	}

}
