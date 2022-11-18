	/*
 
  Trig.java -> L3-6
 
 */

public class Trig
{

	public static void main(String[] args)
	{
		StdOut.print("Enter x: ");
		double x = StdIn.readDouble();

		StdOut.print("Enter y: ");
		double y = StdIn.readDouble();

		StdOut.printf("The formula is sin(%f + %f) = sin(%f)*cos(%f)+cos(%f)*sin(%f)\n", x, y, x, y, x, y);
		StdOut.printf("The left side is: %f\n", Math.sin(x + y));
		StdOut.printf("The right side is: %f\n", Math.sin(x) * Math.cos(y) + (Math.cos(x) * Math.sin(y)));
		StdOut.println(); // for spacing purpose
		
		StdOut.printf("The formula is cos(%f + %f) = cos(%f)*cos(%f)-sin(%f)*sin(%f)\n", x, y, x, y, x, y);
		StdOut.printf("The left side is: %f\n", Math.cos(x + y));
		StdOut.printf("The right side is: %f\n", Math.cos(x) * Math.cos(y) - (Math.sin(x) * Math.sin(y)));
		StdOut.println(); // for spacing purpose
		
		//tan(x+y) = (tan(x) + tan(y)) / (1 – tan(x)*tan(y))
		StdOut.printf("The formula is tan(%f + %f) = (tan(%f)+tan(%f)) / (1-tan(%f)*tan(%f))\n", x, y, x, y, x, y);
		StdOut.printf("The left side is: %f\n", Math.tan(x + y));
		StdOut.printf("The right side is: %f\n",( Math.tan(x) + Math.tan(y)) / (1-(Math.tan(x) * Math.tan(y))));
		StdOut.println(); // for spacing purpose
		// do the remaining two...

	}

}
