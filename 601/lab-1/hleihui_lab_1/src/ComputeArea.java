//  
// ComputeArea.java - [L1-3]
// 
// Read double radius of circle, then print its area
//

import java.util.Scanner;

public class ComputeArea
{

	public static void main(String[] args)
	{
		StdOut.println ("Enter the double radius of a circle: ");
//		Scanner scan = new Scanner(System.in);

//		double radius = StdIn.readDouble();   //.nextDouble();
		
		String rStr = StdIn.readString();
		double radius = Double.parseDouble(rStr);
		
		double area = Math.PI * Math.pow(radius, 2);
		
        System.out.println("The area of a circle of radius " + radius + " is " + area);

	}

}
