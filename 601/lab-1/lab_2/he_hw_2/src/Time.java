
/*
 * 
 *  Time.java -> H2-2
 *  
 *  Programming Project PP2.7
 *  
 *  See handout for details.
 * 
 */

public class Time
{

	public static void main(String[] args)
	{
		StdOut.print("Pls. input an Integer number:");
		int totalSeconds = StdIn.readInt();
		int hours = totalSeconds / 3600;
		int minutes = (totalSeconds-hours*3600) / 60;
		int seconds = totalSeconds % 60;
		StdOut.println(totalSeconds+" seconds is equivalent "+hours+" hours,"+minutes+" minutes,"+seconds+" seconds.");
		// finish this!

	}

}
