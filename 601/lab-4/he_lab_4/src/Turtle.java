
import java.awt.Color;

/**
 * Lab 4-9 helper: Turtle.java
 * 
 * From Sedgewick and Wayne's site...
 * 
 *
 */
public class Turtle
{
	private double x, y; // turtle is at (x, y)
	private double angle; // facing this many degrees counterclockwise from the
							// x-axis
	private boolean isPenUp; // true => no ink when moving, otherwise draw

	// start at (x0, y0), facing a0 degrees counterclockwise from the x-axis
	public Turtle(double x0, double y0, double a0)
	{
		x = x0;
		y = y0;
		angle = a0;
		isPenUp = false;
	}

	// rotate orientation delta degrees counterclockwise
	public void turnLeft(double delta)
	{
		angle += delta;
	}

	// move forward the given amount, with the pen down
	public void goForward(double step)
	{
		double oldx = x;
		double oldy = y;
		x += step * Math.cos(Math.toRadians(angle));
		y += step * Math.sin(Math.toRadians(angle));
		if (!isPenUp)
			StdDraw.line(oldx, oldy, x, y);
	}

	// copy to onscreen
	public void show()
	{
		StdDraw.show();
	}

	// pause t milliseconds
	public void pause(int t)
	{
		StdDraw.pause(t);
	}

	public void setPenColor(Color color)
	{
		StdDraw.setPenColor(color);
	}

	public void setPenRadius(double radius)
	{
		StdDraw.setPenRadius(radius);
	}

	public void setCanvasSize(int width, int height)
	{
		StdDraw.setCanvasSize(width, height);
	}

	public void setXscale(double min, double max)
	{
		StdDraw.setXscale(min, max);
	}

	public void setYscale(double min, double max)
	{
		StdDraw.setYscale(min, max);
	}

	public void penDown()
	{
		isPenUp = false;
	}

	public void penUp()
	{
		isPenUp = true;
	}

	// sample client for testing
	public static void main(String[] args)
	{
		double x0 = 0.5;
		double y0 = 0.5;
		double a0 = 0.0;

		double step = Math.sqrt(3) / 4;

		// turtle starts at center of screen (0.5,0.5) with heading 60

		Turtle turtle = new Turtle(x0, y0, a0);
		
		turtle.setPenColor(Color.BLUE);
		turtle.penDown();
		turtle.goForward(step);
		turtle.turnLeft(90.0);
		turtle.goForward(step);
		turtle.turnLeft(90.0);
		turtle.goForward(step);
		turtle.turnLeft(90.0);
		turtle.goForward(step);
		turtle.turnLeft(90.0);

	}

}
