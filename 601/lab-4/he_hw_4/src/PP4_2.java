/*
 *   PP4_2.java -> h4-2
 */

//
// Modify the solution to PP4.1 so that the
//	user can evaluate multiple years.  Allow
//	the user to terminate the program using an
//	appropriate sentinel value.  Validate each
//	input to ensure that it is greater than or
//	equal to 1582
//

public class PP4_2
{

	public static void main(String[] args)
	{
		int year = 2021;
		while (year >= 0)
		{
			// read year from user:
			StdOut.print("Pls. enter a year: ");
			year = StdIn.readInt();
			// if < 1582 but >= 0
			// print error msg then continue
			if(year >= 0 && year < 1582)
			{
				StdOut.println("Pls. re-enter a year(> 1582)");
				year = StdIn.readInt();
			}
			else if(year < 0)
			{
				StdOut.println("Exiting");
				break;
			}
			// else if year <0
			// print exiting and break

			// how to check if year is leap:
			//
			// if year evenly divisible by 400, it's a leap year

			// else if year evenly divisible by 100, it's NOT a leap year

			// else if year evenly divisible by 4, it's a leap year

			// else it's NOT a leap year
			//
			// print out whether it's a leap year - or not
			if(year % 400 == 0)
			{
				StdOut.println(year+" is a leap year");
			}
			else if(year % 100 == 0)
			{
				StdOut.println(year+" is not a leap year");
			}
			else if(year % 4 == 0)
			{
				StdOut.println(year+" is a leap year");
			}
			else
			{
				StdOut.println(year+" is not a leap year");
			}
			// note the 'multiple alternative decisions' structure of above
			// if-else's:
			// first condition that is satisfied gives answer, then we skip over
			// remaining ifs

			// print out
		}

	}

}
