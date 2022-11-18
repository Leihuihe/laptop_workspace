/**
 * 
 * Swap.java => H1-4
 * 
 */

public class Swap
{
	public static void main(String[] args)
	{
		StdOut.println("Pls. input an integer A");
		int intA = StdIn.readInt();
		StdOut.println("Pls. input an integer B");
		int intB = StdIn.readInt();
		StdOut.println("intA:"+intA+" intB:"+intB);
		int intC = intA;
		intA = intB;
		intB = intC;
		StdOut.println("After swap  intA:"+intA+" intB:"+intB);
	}
}