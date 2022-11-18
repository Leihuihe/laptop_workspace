package jf2;
//********************************************************************

//  Addition.java       Java Foundations
//
//  Demonstrates the difference between the addition and string
//  concatenation operators.
//********************************************************************

public class Addition
{
	// -----------------------------------------------------------------
	// Concatenates and adds two numbers and prints the results.
	// -----------------------------------------------------------------
	public static void main(String[] args)
	{
		System.out.println("24 and 45 concatenated: " + 24 + 45);

		System.out.println("24 and 45 added: " + (24 + 45));
		String name1 = "Ada, Countess of Lovelace";
		String name2 = "Grace Murray Hopper";
		name2 = name1;
		name1 = name1.toLowerCase();
		System.out.println(name1+name2);
	}
}
