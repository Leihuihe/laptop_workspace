//
// PP8_1.java -> H8-1
//

public class PP8_1
{

	public static void main(String[] args)
	{
		MonetaryCoin mCoin1 = new MonetaryCoin(0.5);	
		MonetaryCoin mCoin2 = new MonetaryCoin(0.25);	
		MonetaryCoin mCoin3 = new MonetaryCoin(0.1);
		double sum = 0.0;
		sum = mCoin1.getValue() + mCoin2.getValue() + mCoin3.getValue();
		StdOut.println("sum of coins: "+sum);
		for(int i=1; i<=5; i++)
		{
			StdOut.print(i+" time flip: ");
			mCoin1.flip();
			StdOut.println(mCoin1);
		}
	}

}
