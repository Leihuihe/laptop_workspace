
public class MyCrookedDie extends Die{
	
	public void roll()
	{
		this.setLastRoll((int)Math.random()*3+1);
	}
	
	public String toString() // this OVERRIDES Die's toString()
	{
		return "MyCrookedDie always rolling 1,2,3"; 
	}
}
