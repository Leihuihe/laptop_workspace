/**
 * Lab 4, problem 9 (extra)
 * 
 */
public class Num2English
{
	public static String onesEnglish(int digit)
	{
		String toReturn = "";

		switch (digit)
		{
		case 1:
			toReturn = "one";
			break;
		case 2:
			toReturn = "two";
			break;
		case 3:
			toReturn = "three";
			break;
		case 4:
			toReturn = "four";
			break;
		case 5:
			toReturn = "five";
			break;
		case 6:
			toReturn = "six";
			break;
		case 7:
			toReturn = "seven";
			break;
		case 8:
			toReturn = "eight";
			break;
		case 9:
			toReturn = "nine";
			break;
		}

		return toReturn;
	}

	public static void main(String[] args)
	{
		int num = 27;
		
		int ones = num % 10;
		int tens = num / 10;
		StdOut.println(onesEnglish(ones));
	}

}
