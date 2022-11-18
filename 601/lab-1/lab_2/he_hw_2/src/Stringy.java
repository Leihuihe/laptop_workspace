
/*
 * 
 *  Stringy.java -> H2-1
 *  
 *  Convert input Strings to int, long, double.
 *  
 *  Use Integer.parseInt(String), etc.
 *  
 *  Then print out original String + 3 primitive equivalents.
 * 
 */

public class Stringy
{

	public static void main(String[] args)
	{
		StdOut.print("Pls. input a String number:");
		String num_s = StdIn.readString();
		int num_i = Integer.parseInt(num_s);
		long num_l = Long.parseLong(num_s);
		double num_d = Double.parseDouble(num_s);
		StdOut.println("String:"+num_s+"\tInt"+num_i+"\tLong:"+num_l+"\tDouble:"+num_d);

		// complete this!

	}

}
