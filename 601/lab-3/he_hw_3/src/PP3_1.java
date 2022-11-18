/*
 
 PP3_1.java -> H3-2
 
*/
import java.util.Random;
public class PP3_1
{

	public static void main(String[] args)
	{
		StdOut.print("Input your first name: ");
		String fname = StdIn.readLine();
		StdOut.print("Input your last name: ");
		String lname = StdIn.readLine();
		if(lname.length()<5)
		{
			StdOut.print("Input your last name(>5 chars): ");
			lname = StdIn.readLine();
		}
		Random random = new Random();
		StdOut.println(fname.charAt(0)+lname.substring(0, 5)+random.nextInt(10,100));
	}

}
