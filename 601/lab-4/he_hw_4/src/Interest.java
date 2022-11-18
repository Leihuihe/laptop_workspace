/*
 *   Interest.java -> h4-3
 */

public class Interest
{

	public static void main(String[] args)
	{
		StdOut.print("enter an initial savings deposit: ");
		double iAmt = StdIn.readDouble();
		StdOut.print("enter an annual interest n% : ");
		double iRate = StdIn.readDouble() / 100.0; // 4.7% == iRate*100, so iRate == 4.7/100 == 0.047
		double cumInterest = 0.0; // how much interest earned thus far
		double startingAmt = iAmt; // used for calculating cumInterest
		StdOut.println("Year #\tiAmt\t\tCumulative Interest");
		for (int yearNum = 0; yearNum <= 5; yearNum++)
		{
			// print current values of yearNum, iAmt, cumInterest
			// use StdOut.printf("%d\t\t$%.2f\t\t$%.2f",yearNum, iAmt,
			// cumInterest), etc.
			// as formatting for $
			
			StdOut.printf("%d\t$%.2f\t\t$%3.2f\n",yearNum, iAmt, cumInterest );
			// calculate new values for printing in next loop iteration:
			iAmt = (1+iRate)*iAmt;
			cumInterest = iAmt - startingAmt;
			

		}
	}

}
