
/**
 * Lab 4, problem 1
 * 
 */
public class StringCompare
{

	public static void main(String[] args)
	{
		String userEntered = StdIn.readString();

		if (userEntered.equals("yes"))
		{
			StdOut.println("they agree!");
		}
		else
		{
			StdOut.println("they don't agree?");
		}

	}

}
