//
//	Bullseye.java - [L1-5]
//
// First set project configuration to set three command-line args 
//	via Run->Run Configurations: radius of starting circle, # of circles, radius increment.
//
// Hint: try 0.05, 10, 0.05
// 
// Keep in mind: the drawing area is a square, 1.0 for each side,
//   with center (origin) of drawing area at (0.5, 0.5).
//
// Then run it.
//
// Then remove the args[] dependencies by instead reading each value from the
//	console using StdIn.readInt() and StdIn.readDouble()
//

public class Bullseye
{

	public static void main(String[] args)
	{
	
		double radius = StdIn.readDouble();//Double.valueOf(args[0]);
		int numCircles = StdIn.readInt();//Integer.valueOf(args[1]);
		double rInc = StdIn.readDouble();//Double.valueOf(args[2]);
		
		for (int count=0; count < numCircles; count++)
		{			
			StdDraw.circle(0.5, 0.5, radius); // (0.5,0.5) is origin of drawing area
			radius += rInc;
		}
	}

}
