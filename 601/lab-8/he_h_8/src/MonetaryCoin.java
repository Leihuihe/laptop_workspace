//
// MonetaryCoin.java -> H8-1
//

// complete this as per JF PP8.1 and the handout instructions

public class MonetaryCoin extends Coin
{
	private double value;
	
	public MonetaryCoin(double value) 
	{
		this.value = value;
	}
	
	public double getValue()
	{
		return this.value;
	}
	
	public static void main(String[] args)
	{
		// finish this
		MonetaryCoin mCoin = new MonetaryCoin(1);
		StdOut.println("value of coin: "+mCoin.getValue());
		mCoin.flip();
		StdOut.println(mCoin);
	}

}
