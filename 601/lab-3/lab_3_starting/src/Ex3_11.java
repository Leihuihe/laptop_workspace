import java.text.DecimalFormat;

/*
 
  Ex3_11.java -> L3-4
 
 */

public class Ex3_11
{

	public static void main(String[] args)
	{

		StdOut.print("Enter a double: ");

		double dValue;

		dValue = StdIn.readDouble();

		StdOut.printf("You entered %3.3f\n", dValue); // we'll discuss how this
														// works in lab

		// Complete this by printing dValue to the 4th power,
		// computed 2 different ways
		double result1 = dValue*dValue*dValue*dValue;
		double result2 = Math.pow(dValue, 4);
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		StdOut.println(fmt.format(result1));
		StdOut.println(fmt.format(result2));
		StdOut.printf("%6.3f",result1);
		// Print results to 3 decimal places

	}

}
