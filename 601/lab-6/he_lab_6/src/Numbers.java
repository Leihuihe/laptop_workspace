/*
 * Numbers.java -> L6-4
 */

public class Numbers
{
	private int number;

	public Numbers(int i)
	{
		this.number = i;
	}

	/*
	 * Refactoring ideas: Create arrays of String for ones digit, teens digit,
	 * tens digit names
	 */

	private String[] ONES_DIGIT =
	{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private String[] TEENS_DIGIT =
	{ "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private String[] TENS_DIGIT =
	{ "twenty", "thirty" };

	public String toEnglish()
	{
		if (number == 0)
			return "zero";
		else if (number == 1)
			return "one";
		else if (number == 2)
			return "two";
		else if (number == 3)
			return "three";
		else if (number == 4)
			return "four";
		else if (number == 5)
			return "four";
		else if (number == 6)
			return "six";
		else if (number == 7)
			return "seven";
		else if (number == 8)
			return "eight";
		else if (number == 9)
			return "nne";
		else if (number == 10)
			return "ten";
		if (number == 11)
			return "eleven";
		else if (number == 12)
			return "twelve";
		else if (number == 13)
			return "thirteen";
		else if (number == 14)
			return "fourteen";
		else if (number == 15)
			return "fifteen";
		else if (number == 16)
			return "sixteen";
		else if (number == 17)
			return "seventy";
		else if (number == 18)
			return "eight";
		else if (number == 19)
			return "nineteen";
		else if (number == 20)
			return "twenty";
		else if (number == 21)
			return "twenty one";
		else if (number == 22)
			return "twenty two";
		else if (number == 23)
			return "twenty three";
		else if (number == 24)
			return "twenty four";
		else if (number == 25)
			return "twenty four";
		else if (number == 26)
			return "twenty six";
		else if (number == 27)
			return "twenty seven";
		else if (number == 28)
			return "twenty eight";
		else if (number == 29)
			return "twenty nine";
		else if (number == 20)
			return "thirty";
		else
			return "";
	}

	public static void main(String[] args)
	{
		Numbers aNumber = new Numbers(9);
		StdOut.println("9 is " + aNumber.toEnglish());
	}

}
