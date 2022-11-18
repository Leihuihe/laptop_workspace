/*
 * 
 * Parenthesized -> L2-2
 * 
 * Fully parenthesize the second of each println() statement to reflect 
 * 	the order in which operators are applied
 * 
 */

public class Parenthesized
{

	public static void main(String[] args)
	{
		int a = 3;
		int b = 4;
		int c = -1;
		int d = -2; // values aren't critical, but

		StdOut.println(a - b - c - d);
		StdOut.println((((a - b) - c) - d)); // this is full parenthesizing of
												// // previous

		StdOut.println(a - b + c - d);
		StdOut.println(((a - b) + c) - d);

		StdOut.println(a + b / c - d);
		StdOut.println(a + (b / c) - d);

		StdOut.println(a + b / c * d);
		StdOut.println(a + ((b / c) * d));

		StdOut.println(a / b * c - d);
		StdOut.println(((a / b) * c) - d);

		StdOut.println(a % b / c * d);
		StdOut.println((((a % b) / c) * d));

		StdOut.println(a % b % c % d);
		StdOut.println((((a % b) % c) % d));

		StdOut.println(a - b * c + d);
		StdOut.println(a - (b * c) + d);

		StdOut.println(a + b - c / d);
		StdOut.println(a + b - (c / d));

		StdOut.println(a = b = c = d);
		StdOut.println(a = (b = (c = d)));

	}

}
