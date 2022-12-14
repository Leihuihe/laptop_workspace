package com.visualpairprogrammers.isbntolls;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(140449116);
		assertTrue("first value",result);
		result = validator.checkISBN(140177396);
		assertTrue("second value",result);
	}
	
	@Test
	public void checkAnInvalidISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(140449117);
		assertFalse(result);
	}

}
