import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Lab 4, problem 6
 * 
 */
public class Defend
{
	// The following is a copy of jf4.Average.java.
	// Modify it as given in the handout...

	public static void main(String[] args)
	{
		int value;

		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter an integer >=0: ");
//		value = scan.nextInt();
//
//		while (value < 0) 
//		{
//
//			System.out.println("Wrong Integer, Pls. reenter. ");
//
//			System.out.println("Enter an integer >=0: ");
//			value = scan.nextInt();
//		}
		do
		{
			System.out.println("Enter an integer >=0: ");
			value = scan.nextInt();
		}
		while(value < 0);
		StdOut.println("You entered:"+value);
		
	}

}
