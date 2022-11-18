/*
 
 	NumbersAgain.java -> L7.1
 
 */

public class NumbersAgain
{
	private int number;

	public NumbersAgain(int i)
	{
		this.number = i;
	}

	/*
	 * Refactoring ideas: 
	 *    Use arrays of String for ones digit, teens digit, tens digit names
	 *    
	 *    Break number into tens digit and ones digit, then index into arrays
	 *    	(handle "teens" separately)
	 */

	private String[] ONES_DIGIT =
	{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private String[] TEENS_DIGIT =
	{ "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private String[] TENS_DIGIT =
	{ "","","twenty", "thirty", "forty", "fifty" };

	public String toEnglish()
	{
		if(number < 10)
			return ONES_DIGIT[number];
		else if(number >= 10 && number < 20)
			return TEENS_DIGIT[number%10];
		else if(number >= 20)
		{
			int tens = number / 10;
			int ones = number % 10;
			
			String toReturn = TENS_DIGIT[tens];
			if(ones != 0)
				toReturn = toReturn + " " + ONES_DIGIT[ones];
			return toReturn;
		}
		else 
			return "";
	}

	public static void main(String[] args)
	{
		int number = StdIn.readInt();
		NumbersAgain aNumber = new NumbersAgain(number);
		StdOut.println(number+" is " + aNumber.toEnglish());
	}

}