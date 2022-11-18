import java.util.Arrays;

/* 
    PowerArray.java -> H7-3
 */

public class PowerArray
{	
	public static int[] buildPowerArray(int[] initArray, int exponent)
	{
		// finish this
		int[] toReturn = new int[initArray.length];
		for(int i=0; i<initArray.length; i++)
		{
			toReturn[i] = (int) Math.pow(initArray[i], exponent);
		}
		return toReturn;
	}
	
	public static void main(String[] args)
	{
		// create two different-length int arrays
		int[] array_a = {1, 3, 7, 11};
		int[] array_b = new int[5];
		StdOut.println("array_a: "+Arrays.toString(array_a));		
		for(int i =0; i< array_b.length; i++)
		{
			array_b[i] = i;
		}
		StdOut.println("array_b: "+Arrays.toString(array_b));
		int[] power_a = buildPowerArray(array_a, 2);
		int[] power_b = buildPowerArray(array_b, 3);
		StdOut.println("power_a: ");
		for(int i =0; i< power_a.length; i++)
		{
			StdOut.println(power_a[i]);
		}
		StdOut.println("power_b: ");
		for(int i =0; i< power_b.length; i++)
		{
			StdOut.println(power_b[i]);
		}
	}

}
