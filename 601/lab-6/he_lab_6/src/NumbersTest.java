
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class NumbersTest
{

	@Test
	public void english_0_test()
	{
		Numbers number_0 = new Numbers(0);
		//StdOut.println(number_0.toEnglish());
		assertEquals("zero", number_0.toEnglish());

	}

	@Test
	public void english_1_test2()
	{
		Numbers number_1 = new Numbers(1);
		assertEquals("one", number_1.toEnglish());

	}

	@Test
	public void english_11_test2()
	{
		Numbers number_11 = new Numbers(11);
		assertEquals("eleven", number_11.toEnglish());

	}
}
