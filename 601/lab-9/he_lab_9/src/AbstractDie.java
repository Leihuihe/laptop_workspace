//
// AbstractDie.java -> L9-1
//
 
public abstract class AbstractDie implements Rollable
{
	// finish this...
	private int lastRoll;
	
	public AbstractDie()
	{
		CrapsGame.println("AbstractDie() called");
	}
	
	public int getLastRoll()
	{
		return this.lastRoll;
	}
	
	protected void setLastRoll(int roll)
	{
		this.lastRoll = roll;
	}
	
	public abstract void roll();
	
	public String toString()
	{
		return "lastRoll: "+this.getLastRoll();
	}
	
	public boolean equals(Object die2)
	{
		if (!(die2 instanceof AbstractDie))
			return false;
		if (this.getLastRoll() == ((AbstractDie)die2).getLastRoll())
			return true;
		else 
			return false;
	}
}
