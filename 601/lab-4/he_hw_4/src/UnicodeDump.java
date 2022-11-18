/*
 *   UnicodeDump.java -> h4-4
 */

public class UnicodeDump
{

	public static void main(String[] args)
	{
		// read start, stop from user
		StdOut.print("Enter start (int): ");
		int start = StdIn.readInt();
		StdOut.print("Enter stop (int): ");
		int stop = StdIn.readInt();

		// print out line header with first number as start
		StdOut.printf("%04d: ", start);
		for (int charNum = start; charNum <= stop; charNum++)
		{
			// check if we're at the start of a new line: charNum%32 == 0?
			// if so, start a new line (StdOut.println()
			// then print num at start of line
			

			if (charNum % 32 == 0 && charNum != 0)
			{
				StdOut.println(); // dump previously-built line...
				StdOut.printf("%04d: ", charNum); // print start of next line
				// replace ..... with formatting %d
			}

			// print char (no newline):

			StdOut.printf("%c", charNum);

		}

	}

}
