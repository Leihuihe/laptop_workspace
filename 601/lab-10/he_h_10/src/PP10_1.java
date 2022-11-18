/*
 * 
 * PP10_1.java -> h10-1
 * 
 */

public class PP10_1
{

	public static void main(String[] args)
	{
		StdOut.println("Pls. enter 10 intergers");
		int sum = 0;
		int i = 0;
		while(i<10)
		{
			try {
				sum += Integer.parseInt(StdIn.readString());
			} catch (Exception e) {
				StdOut.println("NAN, pls re-enter");
				continue;
			}
			i++;
		}
		StdOut.print("The average of 10 intergers is:");
		StdOut.println(sum*1.0/10);

	}

}
