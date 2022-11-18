package jf7;

import java.util.Random;

public class tt {

	public static void main(String[] args) {
		int[] test_grades = new int [47];
		Random random = new Random();
		for(int i=0; i<test_grades.length; i++)
		{
			test_grades[i] = random.nextInt(60,100);
		}
		int[] home_grades = new int[20];
		String[] names = new String[20];
		for(int i=0; i<home_grades.length; i++)
		{
			home_grades[i] = random.nextInt(80,100);
		}
		for(int grade: home_grades)
		{
			System.out.println(grade);
		}
	}

}
