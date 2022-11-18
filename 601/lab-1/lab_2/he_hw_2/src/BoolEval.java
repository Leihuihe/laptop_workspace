/*
 * 
 *  BoolEval.java -> H2-4
 *  
 *  Read boolean BoolA and boolB from user,
 *  then print out six boolean expressions
 *  given in handout.
 * 
 */


public class BoolEval
{

	public static void main(String[] args)
	{
		StdOut.print("Pls. input 2 boolean valus(ture or false):");
		boolean boolA = StdIn.readBoolean();
		boolean boolB = StdIn.readBoolean();
		StdOut.println("boolA == "+boolA);
		StdOut.println("boolB == "+boolB);
		StdOut.println("boolA && boolB == "+(boolA && boolB));
		StdOut.println("boolA || boolB == "+(boolA || boolB));
		StdOut.println("!boolA == "+!boolA);
		StdOut.println("!boolB == "+!boolB );
		// finish this!
	}

}
