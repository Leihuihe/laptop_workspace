//
//	Fractional.java - [L1-7]
//
// Read a double, then print out its fractional part.
//

public class Fractional
{

	public static void main(String[] args)
	{
		double number;
		
		number = StdIn.readDouble();
		double fractional = number - (int)number;
		StdOut.println("The fractional of you number is"+fractional);
	}

}
