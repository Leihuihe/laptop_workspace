/*
 
 PIdentities.java -> H3-1
 
*/

public class PIdentities
{

	public static void main(String[] args)
	{
		// the following is from [L3-6]'s Trig solution:
		// use it as a template by replacing with Pythagorean identity
		// formulas as described in handout

//		StdOut.print("Enter theta: ");
//		double theta = StdIn.readDouble();
//
//		StdOut.printf("The formula is: sin(%f) = cos(Math.PI/2.0 - %f)\n", theta, theta);
//		StdOut.printf("The left side is: %f\n", Math.sin(theta));
//		StdOut.printf("The right side is: %f\n", Math.cos(Math.PI / 2.0 - theta));
		
		StdOut.print("Enter x: ");
		double x = StdIn.readDouble();

		StdOut.print("Enter y: ");
		double y = StdIn.readDouble();

		//sin(x-y) = sin(x)*cos(y) - cos(x)*sin(y)
		StdOut.printf("The formula is sin(%f - %f) = sin(%f)*cos(%f)-cos(%f)*sin(%f)\n", x, y, x, y, x, y);
		StdOut.printf("The left side is: %f\n", Math.sin(x - y));
		StdOut.printf("The right side is: %f\n", Math.sin(x) * Math.cos(y) - (Math.cos(x) * Math.sin(y)));
		StdOut.println(); // for spacing purpose
		
		//cos(x-y) = cos(x)*cos(y) + sin(x)*sin(y)
		StdOut.printf("The formula is cos(%f - %f) = cos(%f)*cos(%f)+sin(%f)*sin(%f)\n", x, y, x, y, x, y);
		StdOut.printf("The left side is: %f\n", Math.cos(x - y));
		StdOut.printf("The right side is: %f\n", Math.cos(x) * Math.cos(y) + (Math.sin(x) * Math.sin(y)));
		StdOut.println(); // for spacing purpose
		
		//tan(x-y) = (tan(x) - tan(y)) / (1 + tan(x)*tan(y))
		StdOut.printf("The formula is tan(%f - %f) = (tan(%f)-tan(%f)) / (1+tan(%f)*tan(%f))\n", x, y, x, y, x, y);
		StdOut.printf("The left side is: %f\n", Math.tan(x - y));
		StdOut.printf("The right side is: %f\n",( Math.tan(x) - Math.tan(y)) / (1+(Math.tan(x) * Math.tan(y))));
		StdOut.println(); // for spacing purpose

		// now do it for the three given identities in the handout...
	}

}
