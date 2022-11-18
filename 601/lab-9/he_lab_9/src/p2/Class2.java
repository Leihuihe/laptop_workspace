package p2;

import edu.princeton.cs.introcs.StdOut;
import p1.Class1;

public class Class2
{
	private int privateField = 47;
	protected int protectedField = 47;
	int packageField = 47;
	public int publicField = 47;

	public static void main(String[] args)
	{

		Class1 obj1 = new Class1(); // in package p1

		StdOut.println(obj1.publicField);
//		StdOut.println(obj1.protectedField);
//		StdOut.println(obj1.packageField);
//		StdOut.println(obj1.privateField);

		Class2 obj2 = new Class2(); // in package p1

		StdOut.println(obj1.publicField);
//		StdOut.println(obj1.protectedField);
//		StdOut.println(obj1.packageField);
//		StdOut.println(obj1.privateField);

		Class1 obj3 = new Class3(); // in package p1

		StdOut.println(obj3.publicField);
//		StdOut.println(obj3.protectedField);
//		StdOut.println(obj3.packageField);
//		StdOut.println(obj3.privateField);

	}

}
