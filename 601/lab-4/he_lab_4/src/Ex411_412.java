/**
 * Lab 4, problem 2
 * 
 */
public class Ex411_412
{

	public static void main(String[] args)
	{

		// here is the code from Ex 4.11:
		
		int num = 1;
		while (num < 20)
		{
			num++;
			System.out.println(num);
		}

		// equivalent code using do-while loop
		num = 1;
		do
		{
			num++;
			StdOut.println(num);
		}
		while(num < 20);
		
		// equivalent code using for-loop
		for(num = 2; num <= 20; num++)
		{
			StdOut.println(num);
		}

	}
}
