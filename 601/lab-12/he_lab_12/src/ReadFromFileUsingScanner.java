
// Java Program to illustrate
// reading from Text File
// using Scanner Class

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFileUsingScanner
{
	public static void main(String[] args) throws Exception
	{
		// pass the path to the file as a parameter
		File file = new File("popular.txt");
		Scanner sc = new Scanner(file);

		ArrayList<String> all_words = new ArrayList<>();

		while (sc.hasNextLine())
		{
			String nextLine = sc.nextLine();
			if (nextLine.length() == 5)
			{
				all_words.add(nextLine);
			}
		}

		StdOut.println(all_words);
		StdOut.println(all_words.size());
	}
}