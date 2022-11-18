/*
 
 	NumbersTest.java -> L7.1

 */


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class NumbersTest
{

	@Test
	public void english_0_test()
	{
		NumbersAgain number_0 = new NumbersAgain(0);
		StdOut.println(number_0.toEnglish());
		assertEquals("zero", number_0.toEnglish());

	}

	@Test
	public void english_1_test2()
	{
		NumbersAgain number_1 = new NumbersAgain(1);
		assertEquals("one", number_1.toEnglish());

	}

	@Test
	public void english_11_test2()
	{
		NumbersAgain number_11 = new NumbersAgain(11);
		assertEquals("eleven", number_11.toEnglish());

	}

	@Test
	public void english_30_test()
	{
		NumbersAgain number_30 = new NumbersAgain(30);
		assertEquals("thirty", number_30.toEnglish());
	}

	@Test
	public void english_17_test()
	{
		NumbersAgain number_17 = new NumbersAgain(17);
		assertEquals("seventeen", number_17.toEnglish());

	}
}
