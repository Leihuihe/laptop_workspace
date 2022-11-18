/*
 * 
 * Here's an alternative to H2-4, without using StdOut.printf(...)
 * 
 */

public class Scratch
{

	public static void main(String[] args)
	{
		boolean boolA = true;
		boolean boolB = true;
		
		StdOut.println ("boolA && boolB == " + (boolA && boolB)); // parens are needed: see why? (precedence!)
	}

}
