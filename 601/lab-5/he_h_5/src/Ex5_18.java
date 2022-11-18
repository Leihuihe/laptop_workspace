/*
 * 
 * Ex5_18.java -> H5-3
 *
 */

public class Ex5_18
{

	public static boolean isAlpha(char toCheck)
	{
		if((toCheck >= 'a' && toCheck <= 'z')||(toCheck >= 'A' && toCheck <= 'Z'))
//		if((toCheck >= 65 && toCheck <= 90)||(toCheck >= 97 && toCheck <= 122))
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		// read a character ch using StdIn.readChar()
		// call isAlpha(ch)
		// print message depending upon the returned result
		StdOut.println("Pls. enter a char: ");
		char ch = StdIn.readChar();
		if(Ex5_18.isAlpha(ch))
		{
			StdOut.println("It's a letter");
		}
		else
		{
			StdOut.println("It's not a letter");
		}
	}

}
