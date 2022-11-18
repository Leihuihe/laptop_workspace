/*
 * 
 * Ex5_25.java -> L5-1
 *
 */

public class Ex5_25
{
	public static String multiConcat(String str, int count)
	{
		String toReturn = ""; //accumulate the answer

		// finish this...
		for(int num=0; num < count; num++)
		{
			toReturn = toReturn + str;
		}

		return toReturn;
	}

	public static void main(String[] args)
	{
		StdOut.println("Enter a string followd by an int:");
		String s = StdIn.readLine();//"hello";
		int n = StdIn.readInt();

		StdOut.println(multiConcat(s, n)); // expect "hellohellohello"

	}
}
