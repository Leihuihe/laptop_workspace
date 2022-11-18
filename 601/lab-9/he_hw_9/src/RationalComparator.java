/*
 *  
 * RationalComparator.java -> H9-2
 * 
 */

public class RationalComparator implements java.util.Comparator<RationalNumber>
{
	public int compare(RationalNumber a, RationalNumber b)
	{
		// complete this
		double aValue = 1.0*a.getNumerator()/a.getDenominator();
		double bValue = 1.0*b.getNumerator()/b.getDenominator();
		
		if (Math.abs(aValue-bValue) < 0.00001)
		{
			return 0;
			
		}
		else if (aValue > bValue)
		{
			return +1;
		}
		else
			return -1;
		
	}
}
