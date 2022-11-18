import static org.junit.Assert.*;

import org.junit.Test;

public class RationalComparableTest
{

	@Test
	public void test_compareTo_1()
	{
		RationalNumber r1 = new RationalNumber(1,2);
		RationalNumber r2 = new RationalNumber(1,2);
				
		int compareValue1 =r1.compareTo(r2);
		
		assertEquals("both are 1/2",compareValue1,0);
	}
 
	@Test
	public void test_equals()
	{
		RationalNumber r1 = new RationalNumber(1,2);
		RationalNumber r2 = new RationalNumber(1,2);
		
		assertEquals("objects are equals()", r1, r2);
	}
	
	@Test
	public void test_isLike_1()
	{
		RationalNumber r1 = new RationalNumber(1,2);
		RationalNumber r2 = new RationalNumber(1,2);
					
		assertTrue("both are like 1/2", r1.isLike(r2));
	}

	@Test
	public void test_isLike_2()
	{
		RationalNumber r1 = new RationalNumber(0,1);
		RationalNumber r2 = new RationalNumber(0,2);
		
		int compareValue1 = r1.compareTo(r2);
		
		assertTrue("both are like 0", r1.isLike(r2));
	}



}
