//
// CrookedDie1.java -> L9-1
//

public class CrookedDie1 extends AbstractDie
{
	public CrookedDie1()
	{
		CrapsGame.println("CrookedDie1() constructor called.");
	}

	@Override
	public void roll()
	{
		// set inherited field lastRoll to 3, always

		setLastRoll(3);
	}

	// public int getLastRoll() // this OVERRIDES Die's getLastRoll(), replacing
	// it
	// {
	// return 3;
	// }

	public String toString() // this OVERRIDES Die's toString()
	{
		return "CrookedDie1 - " + super.toString(); // + ", and..." +
													// super.toString();
	}

}
