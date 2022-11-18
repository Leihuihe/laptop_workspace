
public class Die
{
	private int lastRoll;

	public Die()
	{
		CrapsGame.println("Die's constructor called.");
		this.roll(); // set the initial value of lastRoll
	}

	public Die(int firstValue) // overloaded constructor: different signature
	{
		setLastRoll(firstValue);
	}

	public int getLastRoll()
	{

		return this.lastRoll;
	}

	protected void setLastRoll(int lastRoll) // protected is visible to
												// subclasses and package
	{
		this.lastRoll = lastRoll;
	}

	public void roll()
	{
		setLastRoll((int) (Math.random() * 6 + 1));
	}

	// try changing public to protected...
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "A Die object with roll " + this.getLastRoll();

		// add the following to the end of the above line:
		// + " " + super.toString()
	}

	public String toString(int msg) // This is overloading... but NOT
									// overriding!
	{
		return msg + this.toString();
	}
}
