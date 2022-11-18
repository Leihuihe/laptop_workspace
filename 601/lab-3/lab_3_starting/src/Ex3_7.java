/*
 
  Ex3_7.java -> L3-1
 
 */

import java.util.Random;

public class Ex3_7
{

	public static void main(String[] args)
	{
		Random rand = new Random();

		StdOut.println(rand.nextInt(11)); // L3-2a: first answer for 0..10

		StdOut.println(rand.nextInt(11)); // L3-2b:
		StdOut.println(rand.nextInt(501)); // L3-2c:
		StdOut.println(rand.nextInt(10)+1); // L3-2d:
		StdOut.println(rand.nextInt(1,11));
		StdOut.println(rand.nextInt(1,501)); // L3-2e:
		StdOut.println(rand.nextInt(25,51)); // L3-2f:
		StdOut.println(rand.nextInt(-10,16)); // L3-2a:

	}
}
