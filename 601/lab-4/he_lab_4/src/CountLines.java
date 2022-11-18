import java.util.Scanner;
import java.io.*;

/**
 * Lab 4, problem 7
 * 
 */
public class CountLines
{
	public static void main(String[] args) throws IOException
	{
		String line;
		Scanner fileScan;

		fileScan = new Scanner(new File("alice.txt"));
		int numLines = 0;
		int numChars = 0;
		// Read and process each line of the file
		while (fileScan.hasNext())
		{
			line = fileScan.nextLine();
			numLines++;
			numChars = numChars + line.length() + 1;
//			System.out.println(line);
		}
		StdOut.println("Number of lines are "+numLines);
		StdOut.println("Number of Chars are "+numChars);
		fileScan.close();
	}
}
