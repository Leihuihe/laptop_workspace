import java.util.Date;

/*
 
 TestDate.java -> H3-3
 
*/

public class TestDate
{

	public static void main(String[] args)
	{
		Date date1 = new Date();
		StdOut.println("Pls. enter an integer:");
		Long ldate = StdIn.readLong();
		Date date2 = new Date(ldate);
		StdOut.println(date1);
		StdOut.println(date2);
		StdOut.println("It's a time since the standard base time known as \"the epoch\", namely January 1, 1970, 00:00:00 GMT(Dec 31 18:00:00 CST 1969)."
				+ "value of ldate represent the specified number of milliseconds that has passed.");
	}

}
