
/*
 *  Lab10.java -> L10-1 through L10-12
 */

public class Lab10
{
	public static String[] stooges =
		  { "Larry Fine", 
			"Moe Howard", 
			"Curly Howard", 
			"Shemp Howard", 
			"Joe Besser", 
			"'Curly' Joe DiRita", 
			"Shemp 'Clone'" };

	public static void main(String[] args) // throws InterruptedException
	{
		System.out.println("Before main() call to method1().");
		method1(); // or Lab10.method1()
		System.out.println("After main() call to method1().");
	}

	public static void method1() // throws InterruptedException
	{
		System.out.println("Before method1() call to method2().");
		
		//method2(); // or Lab10.method2()
		method3();
		//method4();
		// method5();
	
		System.out.println("After method1() call to method2().");
	}

	public static void method2()
	{
		System.out.println("Before method2() int division.");
		int i = 1 / 0; // ArithmeticException
		System.out.println("After method2() int division.");

		System.out.println("Before method2() stooges indexing.");
		System.out.println(stooges[47]); // ArrayIndexOutOfBoundsException
		System.out.println("After method2() stooges indexing.");

		// System.out.println ("Before method2() sleep(1000).");
		// Thread.sleep(1000); // InterruptedException
		// System.out.println ("After method2() sleep(1000).");

	}

	public static void method3() // throws InterruptedException
	{
		try
		{
			System.out.println("Before method3() int division.");
			int i = 1 / 0; // ArithmeticException
			System.out.println("After method3() int division.");

			System.out.println("Before method3() stooges indexing.");
			System.out.println(stooges[2]); // ArrayIndexOutOfBoundsException
			System.out.println("After method3() stooges indexing.");

			 throw new RuntimeException();
		}
		
		catch (ArithmeticException ae)
		{
			System.out.println("ArithmeticException in method3(): " + ae.toString());
			System.out.println("Continuing...");
		}
		catch (ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
			// aie.printStackTrace();
		}
		

		System.out.println("Before method3() sleep(1000).");
		// Thread.sleep(1000); // InterruptedException
		System.out.println("After method3() sleep(1000).");

	}

	public static void method4()
	{
		try
		{
			System.out.println("Before method4() int division.");
			int i = 1 / 1; // ArithmeticException
			System.out.println("After method4() int division.");

			System.out.println("Before method4() stooges indexing.");
			System.out.println(stooges[27]); // ArrayIndexOutOfBoundsException
			System.out.println("After method4() stooges indexing.");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("ArithmeticException in method4(): " + ae.toString());
			ae.printStackTrace();
			
			System.out.println("Continuing...");
		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("ArrayIndexOutOfBoundsException in method4(): " + aioobe);
			aioobe.printStackTrace();

			System.out.println("Returning to caller...");

			 return;
		}

		System.out.println ("After try...catch in method4(): returning...");
		
		// System.out.println ("Before method4() sleep(1000).");
		// Thread.sleep(1000); // InterruptedException
		// System.out.println ("After method4() sleep(1000).");

	}

	public static void method5() // throws InterruptedException
	{
		try
		{
			System.out.println("Before method5() int division.");
			int i = 1 / 1; // ArithmeticException
			System.out.println("After method5() int division.");

			System.out.println("Before method5() stooges indexing.");
			System.out.println(stooges[0]); // ArrayIndexOutOfBoundsException
			System.out.println("After method5() stooges indexing.");
			//System.exit(0);
			//Runtime.getRuntime().exit(0);
			Runtime.getRuntime().halt(0);
			 throw (new RuntimeException());
		}
		catch (ArithmeticException ae)
		{
			System.out.println("ArithmeticException in method5(): " + ae.toString());
			System.out.println("Continuing...");
		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("ArrayIndexOutOfBoundsException in method5(): " + aioobe);
			System.out.println("Returning to caller...");

			return;
		}
		finally
		{
			System.out.println("finally block inside method5()...");
		}

		System.out.println("Before method5() sleep(1000).");
		// Thread.sleep(1000); // InterruptedException
		System.out.println("After method5() sleep(1000).");

	}

}
