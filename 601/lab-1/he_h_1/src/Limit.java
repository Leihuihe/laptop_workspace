/**
 * 
 * Limit.java => H1-2
 * 
 */

public class Limit
{
	public static void main(String[] args)
	{
		while(true)
		{
			StdOut.print("Pls. input a number N: ");
			int N = StdIn.readInt();
			if(N==0) break;
			StdOut.println(Math.pow(1+1.0/N, N));
		}
		// when N is getting larger, the result also gets larger but very slowly
		// it seems that it will come close to 2.72
	}
}