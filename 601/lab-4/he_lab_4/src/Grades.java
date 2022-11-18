/**
 * Lab 4, problem 4
 * 
 */
public class Grades
{

	public static void main(String[] args)
	{
		double percent = StdIn.readDouble();

		// print out letter grade as per 601 syllabus
		// (use "multiple alternative conditions" with if-else if)
		if(percent > 100.0 || percent < 0.0)
		{
			StdOut.println("Bad score");
		}
		else if(percent >= 95.0)
		{
			StdOut.println("A");
		}
		else if(percent >= 92.0)
		{
			StdOut.println("A-");
		}
		else if(percent >= 89.0)
		{
			StdOut.println("B+");
		}
		else if(percent >= 85.0)
		{
			StdOut.println("B");
		}
		else if(percent >= 82.0)
		{
			StdOut.println("B-");
		}
		else if(percent >= 79.0)
		{
			StdOut.println("C+");
		}
		else if(percent >= 74.0)
		{
			StdOut.println("C");
		}
		else if(percent >= 70.0)
		{
			StdOut.println("C-");
		}
		else
		{
			StdOut.println("F");
		}
	}
}
