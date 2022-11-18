//
//	Reflex.java - [L1-6]
//
// Time the interval between two ENTERs.
//

public class Reflex
{

	public static void main(String[] args)
	{
		StdOut.println ("Hit ENTER twice - as fast as you can!");
		
		// read the first ENTER
		String s = StdIn.readLine();
		// get the start time
		
		long start = System.nanoTime();//currentTimeMillis();
		StdOut.println(start);
		
		
		// read the next ENTER
		String t = StdIn.readLine();
		// get the end time
		
		long end = System.nanoTime();//currentTimeMillis();
		
		// print the elapsed time between ENTERs
		StdOut.println(end-start);
	}

}
