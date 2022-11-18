
/*
 * 
 *  Change.java -> H2-3
 *  
 *  Do PP2.9 from end of JF2.
 *  
 *  See handout for details.
 *  
 */

public class Change
{

	public static void main(String[] args)
	{
		StdOut.print("Pls. input a monetary amount:");
		double amount = StdIn.readDouble();
		int fractional = (int)((amount - (int)amount)*100);
		int ten_bills = (int)amount / 10;
		int five_bills = ((int)amount-ten_bills*10) / 5;
		int one_bills = (int)amount-ten_bills*10-five_bills*5;
		int quarters = fractional / 25;
		int dimes = (fractional-quarters*25) / 10;
		int nickels = (fractional-quarters*25-dimes*10) / 5;
		int pennies = fractional-quarters*25-dimes*10-nickels*5;
		StdOut.println(ten_bills+" ten dollar bills");
		StdOut.println(five_bills+" five dollar bills");
		StdOut.println(one_bills+" one dollar bills");
		StdOut.println(quarters+" quarters");
		StdOut.println(dimes+" dimes");
		StdOut.println(nickels+" nickels");
		StdOut.println(pennies+" pennies");
		// finish this!
	}

}
