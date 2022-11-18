/*
 
  Wrapper.java -> L3-7
 
 */

public class Wrapper
{

	public static void main(String[] args)
	{

		// read String, convert to int, square it and print
		StdOut.print("Input an Integer:");
		String s1 = StdIn.readString();
		int s1int = Integer.parseInt(s1);
		StdOut.println(s1int*s1int);
		StdOut.println(Math.pow(s1int, 2));
		// convert previous int to Integer, square it and print
		
		Integer s2int = s1int; //new Integer(s1int)
		StdOut.println(s2int*s2int);
		StdOut.println(Math.pow(s2int, 2));// auto unbox
		// print Integer.MAX_VALUE, Integer.MIN_VALUE
		
		// first oddity: we try to compute 2^31 and 2^31-1
		
		int prod = 1;
		
		for (int i=0; i < 31; i++) { prod *= 2; StdOut.println(prod); }
		StdOut.println("2^31 is: " + prod);
		StdOut.println("2^31-1 is: " + (prod-1));

		// second oddity:  we'll attempt to explain in class
		
		StdOut.println (Integer.MAX_VALUE + Integer.MAX_VALUE);
				
				
	}

}
