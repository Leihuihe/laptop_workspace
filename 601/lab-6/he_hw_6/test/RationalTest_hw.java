/*
 * 
 * GPSDate.java -> H6-1
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalTest_hw
{

	@Test
	public void testAddOneHalfByOneHalf()
	{
		RationalNumber oneHalf = new RationalNumber(1, 2);
		RationalNumber oneHalfAgain = new RationalNumber(1, 2);

		RationalNumber result = oneHalf.add(oneHalfAgain); // oneHalf + oneHalf

		assertTrue("1/2+1/2 isn't 1?", result.isLike(new RationalNumber(1, 1)));
	}

	@Test
	public void testMultiplyOneHalfByOneHalf()
	{
		RationalNumber oneHalf = new RationalNumber(1, 2);
		RationalNumber oneHalfAgain = new RationalNumber(1, 2);

		RationalNumber result = oneHalf.multiply(oneHalfAgain); // oneHalf *
																// oneHalf

		assertTrue("1/2*1/2 isn't 1/4?", result.isLike(new RationalNumber(1, 4)));
	}
	
	@Test
	public void testDivide()
	{
		RationalNumber Num1 = new RationalNumber(-1, 2);
		RationalNumber Num2 = new RationalNumber(3, -9);
		assertTrue(Num2.isLike(new RationalNumber(-1, 3)));
		RationalNumber result = Num1.divide(Num2); 
		assertTrue(result.isLike(new RationalNumber(3, 2)));
	}
	
	@Test
	public void testSubtract()
	{
		RationalNumber Num1 = new RationalNumber(1, 3);
		RationalNumber Num2 = new RationalNumber(1, 4);

		RationalNumber result = Num1.subtract(Num2); 

		assertTrue(result.isLike(new RationalNumber(1, 12)));
	}
	
	@Test
	public void testtoString()
	{
		RationalNumber Num1 = new RationalNumber(0, 0);
		RationalNumber Num2 = new RationalNumber(2, 1);
		RationalNumber Num3 = new RationalNumber(2, 3);

		assertEquals(Num1.toString(),"0");
		assertEquals(Num2.toString(),"2");
		assertEquals(Num3.toString(),"2/3");
	}
	
	@Test
	public void testReduce()
	{
		RationalNumber Num1 = new RationalNumber(0, 0);
		Num1.setDenominator(12);
		Num1.setNumerator(8);
		assertEquals(Num1.toString(),"8/12");
		Num1.reduce();
		assertEquals(Num1.toString(),"2/3");
	}
	
	@Test
	public void testGcd()
	{
		RationalNumber Num1 = new RationalNumber(3, 12);
		
		assertEquals(Num1.gcd(3, 12),3);
	}
	
	@Test
	public void testisLiked()
	{
		RationalNumber Num2 = new RationalNumber(3, -9);
		assertTrue(Num2.isLike(new RationalNumber(-1, 3)));
	}
	

}
