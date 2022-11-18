/*
 * 
 * Stopwatch.java -> L5-6
 *
 */

public class Stopwatch
{

	// startTime: a long field
	private long startTime;
	
	// endTime: another long field
	private long endTime;
	
	// one constructor that does nothing
	public Stopwatch()
	{
		
	}
	
	// start() instance method
	public void start()
	{
		this.startTime = System.currentTimeMillis();
	}
	
	// stop() instance method
	public void stop()
	{
		this.endTime = System.currentTimeMillis();
	}
	
	// getElapsedTime() instance method
	public long getElapsedTime()
	{
		return this.endTime - this.startTime;
	}
	
	public void runTimingTrial()
	{
		StdOut.println("Hit ENTER twice quickly");
		StdIn.readLine();
		this.start();
		StdIn.readLine();
		this.stop();
		StdOut.println("You took " + this.getElapsedTime());
	}
	
	public static void main(String[] args)
	{
		// finish this!
		Stopwatch watch = new Stopwatch();
		watch.runTimingTrial();
	}

}
