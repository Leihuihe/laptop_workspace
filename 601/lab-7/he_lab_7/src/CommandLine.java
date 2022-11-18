/*
 
 	CommandLine.java -> L7.2
 	
 	A copy of JF 7's example, but in the default package.
 
 */

//********************************************************************
//  CommandLine.java       Java Foundations
//
//  Demonstrates the use of command line arguments.
//********************************************************************

public class CommandLine
{
	// -----------------------------------------------------------------
	// Prints all of the command line arguments provided by the
	// user.
	// -----------------------------------------------------------------
	public static void main(String[] args)
	{
		for (String arg : args)
			System.out.println(arg);
	}
}
