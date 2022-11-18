/**
 * 
 * Smallest.java => H1-3
 * 
 */

public class Smallest
{
	public static void main(String[] args)
	{
		double d = 1.0;
		while(true)
		{
			d/=10;
			if(1.0+d == 1.0)
			{
				StdOut.print("When d="+d+"  ");
				StdOut.println("1.0+d=1.0");
				if(1.0+10*d > 1.0) StdOut.println("1.0+10*d>1.0");		
				break;
			}
		}
	}
}