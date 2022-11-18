/*
 *   RationalTest.java -> L6-2
 *   
 *   Starting JUnit 4 test runner
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalTest
{

	@Test
	public void test_get_numerator()
	{
		RationalNumber r1 = new RationalNumber(2,5);
		assertEquals("2 is numerator of 2/5", r1.getNumerator(),2);
	}
	@Test
	public void test_add_fraction_1()
	{
		RationalNumber r1 = new RationalNumber(2,5);
		RationalNumber r2 = new RationalNumber(1,4);
		RationalNumber r3 = new RationalNumber(13,20);
//		assertEquals("2/5 + 1/4 == 13/20", r1.add(r2),r3);
		assertTrue("2/5 + 1/4 == 13/20", (r1.add(r2)).isLike(r3));
	}
	@Test
	public void test_toString1()
	{
		RationalNumber r1 = new RationalNumber(0,1);
		assertEquals("0 is string for 0/1", r1.toString(),"0");
	}
	
	@Test
	public void test_toString2()
	{
		RationalNumber r1 = new RationalNumber(2,1);
		assertEquals("2 is reported for 2/1", r1.toString(),"2");
	}
	
	@Test
	public void test_toString3()
	{
		RationalNumber r1 = new RationalNumber(2,5);
		assertEquals("2/5 is toString", r1.toString(),"2/5");
	}
	

}
