/*
 * 
 *   GPSDateTest.java -> H6-1
 *
 */

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GPSDateTest_hw
{

//	@Test
//	public void fail()
//	{
//		Assert.fail("No tests yet.");
//	}

	@Test
	public void test_invalidMonth1()
	{
		GPSDate date = new GPSDate(13,31,1999);
		assertFalse(date.isValid());
	}
	
	@Test
	public void test_invalidMonth2()
	{
		GPSDate date = new GPSDate(0,30,1999);
		assertFalse(date.isValid());
	}
	
	@Test
	public void test_invalidDay1()
	{
		GPSDate date = new GPSDate(1,32,1999);
		assertFalse(date.isValid());
	}
	
	@Test
	public void test_invalidDay2()
	{
		GPSDate date = new GPSDate(4,31,1999);
		assertFalse(date.isValid());
	}
	
	@Test
	public void test_invalidDay3()
	{
		GPSDate date = new GPSDate(2,29,1999);
		assertFalse(date.isValid());
	}
	
	@Test
	public void test_invalidDay4()
	{
		GPSDate date = new GPSDate(2,0,1999);
		assertFalse(date.isValid());
	}

	@Test
	public void test_validDayofLeap()
	{
		GPSDate date = new GPSDate(2,29,2000);
		assertTrue(date.isValid());
	}

	@Test
	public void test_invalidDayofLeap()
	{
		GPSDate date = new GPSDate(2,30,2000);
		assertFalse(date.isValid());
	}

	@Test
	public void test_invalidYear1()
	{
		GPSDate date = new GPSDate(1,31,1581);
		assertFalse(date.isValid());
	}
	
	@Test
	public void test_invalidYear2()
	{
		GPSDate date = new GPSDate(9,31,1582);
		assertFalse(date.isValid());
	}
	
	@Test
	public void test_invalidYear3()
	{
		GPSDate date = new GPSDate(10,14,1582);
		assertFalse(date.isValid());
	}
	// finish these
}
