
/*
 *  
 *  GasMileage.java -> L2-1
 * 
 *  Replace with stdlib's StdIn and StdOut console I/O
 *  
 */

import java.util.Scanner;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class GasMileage
{
	// -----------------------------------------------------------------
	// Calculates fuel efficiency based on values entered by the
	// user.
	// -----------------------------------------------------------------

	public static void main(String[] args)
	{
		int miles;
		double gallons, mpg;

		//Scanner scan = new Scanner(System.in);

		StdOut.print("Enter the number of miles: ");
		miles = StdIn.readInt();

		StdOut.print("Enter the gallons of fuel used: ");
		gallons = StdIn.readDouble();

		mpg = miles / gallons;

		StdOut.println("Miles Per Gallon: " + mpg);
	}
}
