/*

	QFormat.java -> L3-3

*/

import java.util.Scanner;

public class QFormat
{
	// the following copied from Quadratic in JF 3

	public static void main(String[] args)
	{
		int a, b, c; // ax^2 + bx + c
		double discriminant, root1, root2;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the coefficient of x squared: ");
		a = scan.nextInt();

		System.out.print("Enter the coefficient of x: ");
		b = scan.nextInt();

		System.out.print("Enter the constant: ");
		c = scan.nextInt();

		// Use the quadratic formula to compute the roots.
		// Assumes a positive discriminant.

		discriminant = Math.pow(b, 2) - (4 * a * c);
		root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
		root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

		// now print out original equation
		StdOut.println(a+" * x^2 + "+b+" * x + "+c+" = 0");
		StdOut.printf("%d * x^2 + %d * x + %d = 0\n", a,b,c);
		String out = "%d * x^2 + %d * x + %d = 0".formatted(a,b,c);
		StdOut.println(out);
		// and print out both roots in this format:
		// Root #1: ...
		// Root #2: ...
		StdOut.printf("Root #1: %.4f\n", root1);
		StdOut.printf("Root #2: %f\n", root2);

	}

}
