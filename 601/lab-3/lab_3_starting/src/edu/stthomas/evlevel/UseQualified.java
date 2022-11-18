/*
 
  edu.stthomas.evlevel.UseQualified.java -> L3-0
 
 */

package edu.stthomas.evlevel;

import edu.princeton.cs.introcs.*;

import java.util.Random;
public class UseQualified
{
	public static void main(String[] args)
	{
		// print out the message "It worked!" using StdOut.
//		String s = StdIn.readString();
//		StdOut.println(s);
		Random rand = new Random();
		int rand1 = rand.nextInt(1,7);
		int rand2 = rand.nextInt(1,7);
		StdOut.println(rand1+rand2);
		StdOut.println("It worked");
		
		for(int i=1;i<=47;i++) {
			StdOut.println(i);
		}
			
			
		
	}
}
