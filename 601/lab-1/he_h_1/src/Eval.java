/**
 * 
 * Eval.java => H1-1
 * result = 2 + (3 - 1) * 10 / 5 * (2 + 3) % 3;
 * 
 */

public class Eval
{
	public static void main(String[] args)	
	{
		int x1 = 3 - 1;
		int x2 = 2 + 3;
		int x3 = x1 * 10 / 5 * x2 % 3;
		int result = 2 + x3;
		StdOut.println(result);
		StdOut.println(2 + (3 - 1) * 10 / 5 * (2 + 3) % 3);
	}	
}