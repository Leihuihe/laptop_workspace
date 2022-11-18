//
//	RandomCircle.java - [L1-1]
//
// Fix by adding stdlib.jar to project's Build Path 
//

public class RandomCircles
{

	public static void main(String[] args)
	{
	
		for (int count=0; count < 50; count++)
		{
			double x = Math.random();
			double y = Math.random();
			double r = Math.random();
			
			StdDraw.circle(x, y, r);
		}
	}

}
