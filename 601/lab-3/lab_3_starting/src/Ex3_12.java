

/*
 
  Ex3_12.java -> L3-5
 
 */

public class Ex3_12
{
	enum Days
	{
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}

	public static void main(String[] args)
	{

		// enum Numbers {FortySeven, Others} // an error: we'll explain why in
		// class...
		Days Day1, Day2, Day3;

		Day1 = Days.Sunday;
		Day2 = Days.Monday;
		Day3 = Days.Thursday;

		StdOut.println("day1 value: " + Day1);
		StdOut.println("day1 ordinal: " + Day1.ordinal());
		StdOut.println("day1 name: " + Day1.name());
		
		StdOut.println("day2 value: " + Day2);
		StdOut.println("day2 ordinal: " + Day2.ordinal());
		StdOut.println("day2 name: " + Day2.name());
		
		StdOut.println("day3 value: " + Day3);
		StdOut.println("day3 ordinal: " + Day3.ordinal());
		StdOut.println("day3 name: " + Day3.name());
	}

}
