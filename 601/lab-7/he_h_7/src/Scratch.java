public class Scratch
{
	enum Test {Ace,Two,Three};
	
	public static void main(String[] args)
	{
		Test t1 = Test.Ace;
		
		StdOut.println (t1.name());
		
		for (Test v: Test.values())
			StdOut.println(v);
		
		StdOut.println (Test.Ace.ordinal() > Test.Two.ordinal());
		StdOut.println (Test.valueOf("Three"));
		
	}
}
