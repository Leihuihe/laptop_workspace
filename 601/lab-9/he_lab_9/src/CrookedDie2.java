//
// CrookedDie2.java -> L9-1
//

public class CrookedDie2 extends AbstractDie
{
	public CrookedDie2()
	{
		CrapsGame.println("CrookedDie2() constructor called.");
	}

	public void roll() // can you see what this computes?
	{
		// call the inherited method to get lastRoll from parent Die parts
 
		int testRoll = getLastRoll();

		if (testRoll == 6)
			this.setLastRoll(1);
		else
			this.setLastRoll(testRoll + 1);
	}

	public String toString()
	{
		return "CrookedDie2 - " + super.toString(); // + \", and...\" +
													// super.toString();
	}

}
