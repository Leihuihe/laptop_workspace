/*
 * 
 * GPSDateTest.java -> L6-5
 *
 *  Starting JUnit 4 test runner
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class GPSDateTest
{

	@Test
	public void test_less_than_month_1()
	{
		GPSDate date = new GPSDate(0,15,2022);
		assertFalse("can't have 0 month", date.isValid());
		
	}
	
	@Test
	public void test_jan_less_than_31_days()
	{
		GPSDate date = new GPSDate(1,32,2022);
		assertFalse("can't have 32 in jan", date.isValid());
		
	}

}
