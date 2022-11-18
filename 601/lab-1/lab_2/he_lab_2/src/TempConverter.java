/**
 * 
 * TempConverter.java -> L2-5
 * 
 * Modify code and add comments as described in handout.
 * 
 */

public class TempConverter
{
	// -----------------------------------------------------------------
	// Computes the Fahrenheit equivalent of a specific Celsius
	// value using the formula F = (9/5)C + 32.
	// -----------------------------------------------------------------

	public static void main(String[] args)
	{
		final int BASE = 32;
		// When remove both decimal points, the result is 1, which means it's Integer operation
		// When there is one decimal points, the result is 1.8, which means it's Division operation
		final double CONVERSION_FACTOR = 9.0 / 5;

		double fahrenheitTemp;
		int celsiusTemp = StdIn.readInt(); // value to convert

		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

		System.out.println("Celsius Temperature: " + celsiusTemp);
		System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
	}
}
