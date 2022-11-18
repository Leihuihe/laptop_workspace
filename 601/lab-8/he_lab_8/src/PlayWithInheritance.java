/**
 * 
 * Just some Java code to allow you to explore inheritance, constructor
 * chaining, and polymorphism ("dynamic method lookup")
 * 
 */

public class PlayWithInheritance
{
	public static int RUN_EXAMPLE = 3; // change this to try different behaviors
										// below

	public static void main(String[] args)
	{
		StdOut.println();

		// common to all examples...

		// only show prints in constructor calls for RUN_EXAMPLE==1

		if (RUN_EXAMPLE == 1)
			CrapsGame.showOutput = true;
		else
			CrapsGame.showOutput = false; // turns off all output

		// RUN_EXAMPLE==1 shows which constructors are called in the following

		Die die1 = new Die();
		CrookedDie1 crooked1 = new CrookedDie1();
		CrookedDie2 crooked2 = new CrookedDie2();

		StdOut.println();

		CrapsGame.showOutput = true; // turns output back on

		// change RUN_EXAMPLE above to run any one of the following 6 examples

		if (RUN_EXAMPLE == 1)
		{
			// demos 'constructor chaining'

			StdOut.println("Note the output: constructor chaining.");
		}
		else if (RUN_EXAMPLE == 2)
		{
			// Shows when a reference is treated like a String,
			// toString() is automatically invoked, and its returned value
			// used instead!

			StdOut.println("die1's toString(): \"" + die1.toString() + "\"");
			StdOut.println();

			StdOut.print("toString() is automatically called when reference treated as String: ");
			StdOut.println("\"" + die1 + "\"");
			StdOut.println();

			StdOut.println(
					"Also automatic when concatenating a string to a reference: " + "\"" + die1.toString() + "\"");
		}
		else if (RUN_EXAMPLE == 3)
		{
			// shows subclass method calling overridden superclass method

			// concatenate " " + super.toString() to end of toString() code
			// inside each of 3 classes, then watch the result when run again.

			StdOut.println("die1's toString(): \"" + die1 + "\"");
			StdOut.println();

			StdOut.println("crooked1's toString(): \"" + crooked1 + "\"");
			StdOut.println();

			StdOut.println("crooked2's toString(): \"" + crooked2 + "\"");
		}
		else if (RUN_EXAMPLE == 4)
		{
			// shows...

			// APPARENT type of alias is Die...
			// But ACTUAL type can be Die or ANY subclass of Die:

			Die alias = die1; // try replacing this line with either below

			// Die alias = crooked1; // upcasting!
			// Die alias = crooked2; // ditto

			// which toString() is called? Dynamic method lookup decides at
			// runtime:

			StdOut.println("alias's toString(): \"" + alias.toString() + "\"");
			StdOut.println();
		}
		else if (RUN_EXAMPLE == 5)
		{
			// demonstrates the compiler can't figure out actual type at compile
			// time...

			Die alias; // again: apparent type of alias is Die

			// We assign a random actual type: oneof Die, CrookedDie1,
			// CrookedDie2
			double toss = Math.random(); // [0.0..1.0)

			if (toss < 0.333)
				alias = die1;
			else if (toss < 0.666)
				alias = crooked1;
			else
				alias = crooked2;

			// Can the compiler figure out the actual type
			// of alias in the following call?
			// No => dynamic runtime lookup happens

			describe("Which toString() is called? Answer is: ", alias);
		}
		else if (RUN_EXAMPLE == 6)
		{
			// shows how to create Dice as combo of Die and CrookedDie1

			Dice dice = new Dice(die1, crooked1); // we'll try different
													// substitutions here

			// Dice dice = new Dice(die1, crooked1);
			// Dice dice = new Dice(die1, crooked1);

			dice.roll();

			int result = dice.getLastRoll();

			StdOut.printf("Roll of '%s' and '%s' is: %d.\n", die1, crooked1, result);
		}

		StdOut.println();
	}

	/**
	 * Demonstrates polymorphism via passing either Die ref as toDescribe, or
	 * else CrookedDie1 or CrookedDie2 ref instead
	 */

	public static void describe(String msg, Die toDescribe)
	{
		StdOut.printf("%s '%s' \n", msg, toDescribe.toString());
	}

}
