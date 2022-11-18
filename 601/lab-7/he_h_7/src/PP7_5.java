/*
    PP7_5.java -> H7-1  
 */

public class PP7_5
{
	
	public static void main(String[] args)
	{
		// how many ints to enter?
		
		StdOut.print("Enter number of integers to process(>=0 and <=50): ");
		
		int size = StdIn.readInt();
		
	// create int[] numbers to hold input integers
		if (size<0 || size>50) size=50;
		int[] values = new int[size]; // no more than 50
		
	// fill the array!
		int sum = 0;
		for (int index=0; index < size; index++)
		{
			// store index*index in values[index]
			values[index] = index*index;
			sum += values[index];
			StdOut.print(values[index]+" ");
		}
		double mean = sum*1.0/size;
		StdOut.printf("\nmean: %.6f\n",mean);
		
		double sum_squared = 0.0;
		for (int index=0; index < size; index++)
		{	
			sum_squared += Math.pow((values[index]-mean), 2);
		}
		double std_deviation = Math.sqrt(sum_squared/(size-1));
		StdOut.printf("standard deviation: %.6f",std_deviation);
		// compute sum of all values in values[0..size-1]
		
		// compute and print mean = previous sum / size
		
		// compute sum of (mean-values[index]) squared
		
		// finish computation of std deviation and print
		
	}

}
