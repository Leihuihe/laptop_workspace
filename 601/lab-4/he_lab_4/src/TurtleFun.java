import java.awt.Color;

/**
 * Lab 4-10: TurtleFun.java
 * 
 */
public class TurtleFun
{
	public static void main(String[] args)
	{
		double x0 = 0.5;
		double y0 = 0.5;
		double a0 = 0.0;
		double step = Math.sqrt(3) / 8;

		Turtle turtle = new Turtle(x0, y0, a0);

		// finish this!
		turtle.setPenColor(Color.BLUE);
		turtle.penDown();
//		turtle.goForward(step);
//		turtle.turnLeft(90.0);
//		turtle.goForward(step);
//		turtle.turnLeft(90.0);
//		turtle.goForward(step);
//		turtle.turnLeft(90.0);
//		turtle.goForward(step);
//		turtle.turnLeft(90.0);
		for(int i=0;i<4;i++)
		{
			turtle.goForward(step);
			turtle.turnLeft(90.0);
		}
	}

}
