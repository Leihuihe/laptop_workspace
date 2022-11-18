/*
 * 
 * StringTooLongException.java -> h10-2
 * 
 */

// mimic OutOfRangeException at end of JF10

public class StringTooLongException extends RuntimeException
{
	StringTooLongException(String message)
	{
		super(message);
	}
}
