/*
 * 
 *  Overflow.java -> L2-8
 * 
 *  Add code to the following which shows overflow
 *  	for short, int, long, and float values
 *  
 */

public class Overflow
{

	public static void main(String[] args)
	{
		byte b = Byte.MAX_VALUE;
		b = (byte)(b+1);
		StdOut.println(b);
		StdOut.println(Byte.MIN_VALUE);
		
		int i = Integer.MAX_VALUE;
		i = (int)(i+1);
		StdOut.println(i);
		StdOut.println(Integer.MIN_VALUE);
		
		short s = Short.MAX_VALUE;
		s = (short)(s+1);
		StdOut.println(s);
		StdOut.println(Short.MIN_VALUE);
		
		long l = Long.MAX_VALUE;
		l = (long)(l+1);
		StdOut.println(l);
		StdOut.println(Long.MIN_VALUE);
		
		float f = Float.MAX_VALUE;
		f = (float)(f+1f);
		StdOut.println(f);
		StdOut.println(Float.MIN_VALUE);
		

		byte b_min = Byte.MIN_VALUE;
		b_min = (byte)(b_min-1);
		StdOut.println(b_min);
		StdOut.println(Byte.MAX_VALUE);
		
		int i_min = Integer.MIN_VALUE;
		i_min = (int)(i_min-1);
		StdOut.println(i_min);
		StdOut.println(Integer.MAX_VALUE);
		
		short s_min = Short.MIN_VALUE;
		s_min = (short)(s_min-1);
		StdOut.println(s_min);
		StdOut.println(Short.MAX_VALUE);
		
		long l_min = Long.MIN_VALUE;
		l_min = (long)(l_min-1);
		StdOut.println(l_min);
		StdOut.println(Long.MAX_VALUE);
		
		float f_min = Float.MIN_VALUE;
		f_min = (float)(f_min-1f);
		StdOut.println(f_min);
		StdOut.println(Float.MAX_VALUE);

	}

}
