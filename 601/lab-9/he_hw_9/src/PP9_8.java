/*
 *  
 * PP9_8.java -> H9-3
 * 
 */

public class PP9_8
{
	
	public static void main(String[] args)
	{
		// complete this
		Coin coin = new Coin();
		StdOut.println(coin.toString());
		coin.flip();
		coin.isHeads();
		StdOut.println(coin.toString());
		coin.setKey(47);
		coin.lock(47);
		StdOut.println(coin.toString());
		coin.flip();
		coin.isHeads();
		StdOut.println(coin.toString());
		
	}

}
