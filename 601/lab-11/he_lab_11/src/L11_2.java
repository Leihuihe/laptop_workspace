
/*
 	
 	L11_2.java -> L11-2
 	
 */

// See handout for details...

import java.util.Random;

public class L11_2
{
	public static void main(String[] args)
	{
		SortManager<Integer> intSorter = new SortManager<>(10);
		
		Random rand = new Random();
		
		for (int count=0; count < 10; count++)
			intSorter.addElement(rand.nextInt(10));
		
		intSorter.printElts();
		
		intSorter.sort();
		
		intSorter.printElts();

		SortManager<Student> studentSorter = new SortManager<>(10);

		studentSorter.addElement(new Student("Larry", 3.0));

		// create and add 2 more students with gpa's different than 3.0

		studentSorter.addElement(new Student("Moe", 2.0));
		studentSorter.addElement(new Student("Curly", 4.0));

		// print all elements

		studentSorter.printElts();

		// sort the elements

		studentSorter.sort();

		// print the elements again

		studentSorter.printElts();

	}

}
