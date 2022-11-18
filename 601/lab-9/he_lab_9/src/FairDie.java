//
// Dice.java -> L9-1
//

public class FairDie extends AbstractDie
{
	/**
	 * The value returned by last call to roll()
	 */

	private int lastRoll;

	public FairDie()
	{
		this.roll();
	}

	/**
	 * Accessor or "getter" method for Die:
	 * 
	 * Return last roll of this Die
	 * 
	 * @return this.lastRoll
	 */

//	public int getLastRoll()
//	{
//		return this.lastRoll;
//	}

	/**
	 * Mutator or "setter" method for Die:
	 * 
	 * Set a new value for this Die. Subclasses will call this to alter normal
	 * Die behavior (cheating!)
	 * 
	 */

//	protected void setLastRoll(int newLastRoll) // protected is visible to
//												// subclasses and package
//	{
//		this.lastRoll = newLastRoll;
//	}

	/**
	 * Generate a new random int 1..6 and store in int lastRoll field
	 */
	public void roll()
	{
		setLastRoll((int) (Math.random() * 6 + 1));
	}

	@Override
	public String toString() // can we make this protected? NO... but we'll try
	{
		return "FairDie - " + super.toString();
	}

	public static void main(String[] args)
	{
		FairDie d1 = new FairDie();
		d1.roll();
		int result = d1.getLastRoll();

		StdOut.println(result);
		StdOut.println(d1);
	}
}
