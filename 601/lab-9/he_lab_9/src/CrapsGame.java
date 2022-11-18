//
// CrapsGame.java -> L9-1
//

public class CrapsGame
{
	private int point;
	private Dice dice;
	public static boolean showOutput = true;

	public static void println(String str)
	{
		if (showOutput)
			StdOut.println(str);
	}

	public CrapsGame()
	{
		dice = new Dice();
	}

	public CrapsGame(Rollable die1, Rollable die2)
	{
		dice = new Dice(die1, die2);
	}

	public boolean playOneGame(int[] wins, int[] losses)
	{
		int steps = 1;

		// Roll the dice

		dice.roll();

		// Get the value of the roll as point

		int point = dice.getLastRoll();

		// Print out this value as "Your point is"

		println("Your point is " + point);

		// If point is 7 or 11, announce an immediate win for player,
		// increment wins[steps], and return true indicating win

		if (point == 7 || point == 11) // point is 7 or 11
		{
			println("Win for player with " + point);

			wins[steps] = wins[steps] + 1; // number of wins with exactly steps
											// for the # of steps.
											// shorter version: wins[steps]++;
			return true; // a win!
		}
		// Else if point is 2, 3, or 12, announce an immediate loss for player,
		// increment losses[steps], and return false indicating loss

		else if (point == 2 || point == 3 || point == 12) // point is 2, 3, or
															// 12
		{
			println("Loss for player with " + point);

			losses[steps] = losses[steps] + 1; // number of losses with exactly
												// steps
												// for the # of steps.
												// shorter version:
												// losses[steps]++;
			return false; // alas...
		}

		// If not an immediate win nor loss, print out point
		// roll the dice over and over, keeping track of steps,
		// and printing each rolled value until either:

		// (a) The point is again rolled => a win for player:
		// update wins[] and return true

		// (b) 7 is rolled => a loss for player:
		// update losses[] and return false

		else // point rolled: keep going until point rolled again OR 7 rolled
		{
			println("Point is: " + point);

			int value = 0;
			do
			{
				// roll dice
				dice.roll();

				// increment steps
				steps++;

				// get value of last roll
				value = dice.getLastRoll();

				println("" + dice.getLastRoll());
				// print this value
			}
			while (value != 7 && value != point);
			// stop if 7 (craps->loss) or point (win)

			// check how we exited do..while and record loss or win:

			if (value == 7)
			{
				// loss: record losses and return false
				println("You lose throwing a 7.");
				losses[steps]++;
				return false;
			}
			else if (value == point)
			{
				// win: record wins and return false
				println("You win by throwing your point " + value);
				wins[steps]++;
				return true;
			}
		}
		return true;

	}

	public static void main(String[] args)
	{
		// play a game!

		// set up wins and losses: both int[] of length 100
		// call playOneGame(wins,losses)
		// report result (returned value from previous
	}
}
