/*
 
 PP3_6.java -> H3-4
 
*/

public class PP3_6
{

	public static void main(String[] args)
	{
		StdOut.print("Input the lengths of a side of a triangle: ");
		double a = StdIn.readDouble();
		StdOut.print("\nInput the lengths of b side of a triangle: ");
		double b = StdIn.readDouble();
		StdOut.print("\nInput the lengths of c side of a triangle: ");
		double c = StdIn.readDouble();
		double s = (a+b+c) / 2.0;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		StdOut.printf("\nArea is: %.3f\n",area);
		
		StdOut.println("Also compute and print out the area of the equilateral triangle"
				+ " (all sides of equal length) having the same perimeter (a+b+c) as the original. ");
		StdOut.println("(3E)^2=s*(s-E)^3");
		StdOut.println("s=(a+b+c)/2=1.5E");
		StdOut.println("E≈6.928(4√3)");
		StdOut.println("perimeter=a+b+c=E+E+E=20.784");
		
	}

}
