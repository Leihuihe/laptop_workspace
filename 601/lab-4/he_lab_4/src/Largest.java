/**
 * Lab 4, problem 5
 * 
 */
public class Largest
{

	public static void main(String[] args)
	{
		StdOut.println("Enter next int:");
		int nextInt = StdIn.readInt();
		
		int largestSoFar = nextInt;
		int times = 1;
		
		// loop 10 times, reading into nextInt as you go
		for(int i=0;i<9;i++)
		{
			StdOut.println("Enter next int:");
			nextInt = StdIn.readInt();
			
			if(nextInt > largestSoFar)
			{
				largestSoFar = nextInt;
			}
			else if(nextInt == largestSoFar)
			{
				times++;
			}
			StdOut.println(largestSoFar);
			StdOut.println("Largest number occurs"+times+"times");
			
		}
	}
}
