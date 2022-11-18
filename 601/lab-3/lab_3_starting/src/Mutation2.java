/*
 
  Mutation2.java -> L3-4
 
 */

public class Mutation2
{

	public static void main(String[] args)
	{
		StdOut.println("Input:");
		String phrase = StdIn.readLine();// "Change is inevitable";
		String mutation1, mutation2, mutation3, mutation4, mutation6;

		StdOut.println("Original string: \"" + phrase + "\"");
		StdOut.println("Length of string: " + phrase.length());

		mutation1 = phrase.concat(", except from vending machines.");
		mutation2 = mutation1.toUpperCase();
		mutation3 = mutation2.replace('E', 'X');
		mutation4 = mutation3.substring(3, 30);
		char mutation5 = mutation1.charAt(0);
		mutation6 = mutation3;

		// Print each mutated string
		StdOut.println("Mutation #1: " + mutation1);
		StdOut.println("Mutation #2: " + mutation2);
		StdOut.println("Mutation #3: " + mutation3);
		StdOut.println("Mutation #4: " + mutation4);
		StdOut.println("Mutation #5(first char of mutation3): " + mutation5);
		StdOut.println("Is 2 the same as 1: " + mutation6.equals(mutation3));

		StdOut.println("Mutated length: " + mutation4.length());

	}

}
