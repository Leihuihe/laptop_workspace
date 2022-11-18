/*
 * 
 *  PairOfDice.java -> part of L5-5 
 *
 */

public class PairOfDice
{
	// two private Die fields

	private Die die1;
	private Die die2;

	// constructor which creates two Die objects,
	// assigns to fields, then calls roll method

	public PairOfDice()
	{
		// *** finish this for L5-5 ***
		this.die1 = new Die();
		die1.roll();
		this.die2 = new Die();
		die2.roll();
	}

	// accessor (getter) for getting first Die's value

	public int getDie1Value()
	{
		return die1.getFaceValue();
	}

	// accessor (getter) for getting second Die's value

	public int getDie2Value()
	{
		return die2.getFaceValue();
	}

	// mutator (setter) for setting first Die's value

	public void setDie1Value(int newValue)
	{
		die1.setFaceValue(newValue);
	}

	// mutator (setter) for setting second Die's value

	public void setDie2Value(int newValue)
	{
		die2.setFaceValue(newValue);
	}

	// accessor (getter) for getting sum of two Die values

	public int getCurrentSum()
	{
		// *** finish this for L5-5 ***
		
		return this.die1.getFaceValue() + this.die2.getFaceValue();
	}

	// roll both Die instances
	public void roll()
	{
		// *** finish this for L5-5 ***
		this.die1.roll();
		this.die2.roll();
	}

}
