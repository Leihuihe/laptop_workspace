/*
 *  
 * SuperClass.java -> H9-1
 * 
 */


public class SuperClass
{
	public void method1()
	{
		StdOut.println("SuperClass.method1() called");
		method2();
	}
	
	private void method2()
	{
		StdOut.println("SuperClass.method2() called");
	}

	public static void main(String[] args)
	{
		SubClass class1 = new SubClass();
		class1.method1();
		class1.method2();
		/*It ends up calling its subclass method2 
		because the subclass extends and overrides its method2
		so method2 in superclass is hidden and not be used.
		*/
		
		/*Since the method2 in superclass is private  
		 * the subclass can't extend and override it.
		 * So there are 2 method have the same name.
		 * one belongs to superclass, the another belongs to subclass.
		 * so when in superclass call it , it calls its own method2
		 * when subclass call it , it calls its own method2
		 *  */
	}

}
