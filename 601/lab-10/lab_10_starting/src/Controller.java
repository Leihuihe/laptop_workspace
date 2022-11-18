/*
 * Bonus Lab 10 code:  TicTacToe via Swing!
 * 
 * 
 */

public class Controller
{

	/* First array -> rows */
	/* Second array -> columns */
	private int[][] pieceLocations = new int[3][3];

	/* Initialize to zero meaning the game was a tie */
	private int gameOutcome = 0;

	private int movesRemaining;

	public void makeMove(char symbol, int row, int col)
	{

		/* Determine what value to save depending on the symbol parameter */
		if ('X' == symbol)
		{
			pieceLocations[row][col] = 1;
		}
		else
		{
			pieceLocations[row][col] = 2;
		}

		/* Decrement the number of moves remaining */
		movesRemaining--;
	}

	public boolean isGameOver()
	{
		/* set return value to false until proven true */
		boolean ReturnValue = false;

		/* Check for lines on the horizontal plane */
		/* Check if player 1 won */
		if (((1 == pieceLocations[0][0]) && (1 == pieceLocations[0][1]) && (1 == pieceLocations[0][2]))
				|| ((1 == pieceLocations[0][0]) && (1 == pieceLocations[0][1]) && (1 == pieceLocations[0][2]))
				|| ((1 == pieceLocations[0][0]) && (1 == pieceLocations[0][1]) && (1 == pieceLocations[0][2])))
		{
			ReturnValue = true;
			gameOutcome = 1;
		}
		/* Check if player 2 won */
		else if (((2 == pieceLocations[0][0]) && (2 == pieceLocations[0][1]) && (2 == pieceLocations[0][2]))
				|| ((2 == pieceLocations[1][0]) && (2 == pieceLocations[1][1]) && (2 == pieceLocations[1][2]))
				|| ((2 == pieceLocations[2][0]) && (2 == pieceLocations[2][1]) && (2 == pieceLocations[2][2])))
		{
			ReturnValue = true;
			gameOutcome = 2;
		}
		/* Check for lines on the verical plane */
		/* Check if player 1 won */
		if (((1 == pieceLocations[0][0]) && (1 == pieceLocations[1][0]) && (1 == pieceLocations[2][0]))
				|| ((1 == pieceLocations[0][1]) && (1 == pieceLocations[1][1]) && (1 == pieceLocations[2][1]))
				|| ((1 == pieceLocations[0][2]) && (1 == pieceLocations[1][2]) && (1 == pieceLocations[2][2])))
		{
			ReturnValue = true;
			gameOutcome = 1;
		}
		/* Check if player 2 won */
		else if (((2 == pieceLocations[0][0]) && (2 == pieceLocations[1][0]) && (2 == pieceLocations[2][0]))
				|| ((2 == pieceLocations[0][1]) && (2 == pieceLocations[1][1]) && (2 == pieceLocations[2][1]))
				|| ((2 == pieceLocations[0][2]) && (2 == pieceLocations[1][2]) && (2 == pieceLocations[2][2])))
		{
			ReturnValue = true;
			gameOutcome = 2;
		}
		/* Check for lines on the verical plane */
		/* Check if player 1 won */
		if ((1 == pieceLocations[0][0]) && (1 == pieceLocations[1][1]) && (1 == pieceLocations[2][2]))
		{
			ReturnValue = true;
			gameOutcome = 1;
		}
		/* Check if player 2 won */
		else if ((2 == pieceLocations[0][0]) && (2 == pieceLocations[1][1]) && (2 == pieceLocations[2][2]))
		{
			ReturnValue = true;
			gameOutcome = 2;
		}
		/* Check if no more moves can be made */
		else if (0 == movesRemaining)
		{
			ReturnValue = true;
			gameOutcome = 0;
		}

		return ReturnValue;
	}

	public int getOutcome()
	{
		/* return the saved game outcome */
		return gameOutcome;
	}

	public void resetBoard()
	{
		/* Set all array elements to zero */
		pieceLocations[0][0] = 0;
		pieceLocations[0][1] = 0;
		pieceLocations[0][2] = 0;
		pieceLocations[1][0] = 0;
		pieceLocations[1][1] = 0;
		pieceLocations[1][2] = 0;
		pieceLocations[2][0] = 0;
		pieceLocations[2][1] = 0;
		pieceLocations[2][2] = 0;

		/* 9 total moves */
		movesRemaining = 9;
	}
}
