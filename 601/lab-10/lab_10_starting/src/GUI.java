/*
 * Bonus Lab 10 code:  TicTacToe via Swing!
 * 
 * (We'll discuss this in Class 13...)
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class GUI
{

	private Controller controller = new Controller();

	private JFrame frame;

	private JPanel panelGameStart = new JPanel();
	private JPanel panelGame = new JPanel();
	private JPanel panelGameResult = new JPanel();

	private JLabel labelGameWinnerLine1 = new JLabel("<Player Symbol>");
	private JLabel labelGameWinnerLine2 = new JLabel("<Game Outcome>");

	/* set to player 1 by default */
	private char currentPlayerTurn = 'X';

	private JLabel labelPlayerO = new JLabel("Player O");
	private JLabel labelPlayerX = new JLabel("Player X");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GUI window = new GUI();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		/* Initialize application frame */
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		/* Initialize JPanels */
		/* Game start panel */
		frame.getContentPane().add(panelGameStart, "name_102863778444018");
		panelGameStart.setLayout(null);
		panelGameStart.setVisible(true); /* First screen */

		/* Game panel */
		panelGame.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panelGame, "name_102863798745471");
		panelGame.setVisible(false); /* default to inactive */

		/* Game outcome panel */
		frame.getContentPane().add(panelGameResult, "name_102863817498763");
		panelGameResult.setLayout(null);
		panelGameResult.setVisible(false); /* default to inactive */

		/* Initialize panel labels */
		/* Game start panel header label */
		JLabel labelGameStartHeader = new JLabel("Tic Tac Toe");
		labelGameStartHeader.setFont(new Font("Tahoma", Font.PLAIN, 26));
		labelGameStartHeader.setHorizontalAlignment(SwingConstants.CENTER);
		labelGameStartHeader.setBounds(10, 11, 414, 44);
		panelGameStart.add(labelGameStartHeader);

		/* Start game button label */
		JLabel lblPressTheStart = new JLabel("Press the start button game to start a new game");
		lblPressTheStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblPressTheStart.setBounds(10, 99, 414, 14);
		panelGameStart.add(lblPressTheStart);
		panelGame.setLayout(null);

		/* Game panel header label */
		JLabel labelGameHeader = new JLabel("Tic Tac Toe");
		labelGameHeader.setBounds(10, 11, 414, 44);
		labelGameHeader.setHorizontalAlignment(SwingConstants.CENTER);
		labelGameHeader.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panelGame.add(labelGameHeader);

		/* Player X Label */
		labelPlayerX.setHorizontalAlignment(SwingConstants.CENTER);
		labelPlayerX.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelPlayerX.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelPlayerX.setBounds(24, 122, 84, 36);
		panelGame.add(labelPlayerX);

		/* Player O Label */
		labelPlayerO.setHorizontalAlignment(SwingConstants.CENTER);
		labelPlayerO.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelPlayerO.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		labelPlayerO.setBounds(325, 122, 84, 36);
		panelGame.add(labelPlayerO);

		/* Game Outcome Label Line 1 */
		labelGameWinnerLine1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelGameWinnerLine1.setHorizontalAlignment(SwingConstants.CENTER);
		labelGameWinnerLine1.setBounds(10, 104, 414, 14);
		panelGameResult.add(labelGameWinnerLine1);

		/* Game Outcome Label Line 2 */
		labelGameWinnerLine2.setHorizontalAlignment(SwingConstants.CENTER);
		labelGameWinnerLine2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelGameWinnerLine2.setBounds(10, 123, 414, 14);
		panelGameResult.add(labelGameWinnerLine2);

		/* Initialize buttons */
		/* Start game button */
		JButton buttonStartGame = new JButton("Start Game");
		buttonStartGame.setBounds(149, 124, 140, 23);
		panelGameStart.add(buttonStartGame);

		/*
		 * Game board space buttons
		 */
		JButton buttonUpperLeft = new JButton("");
		buttonUpperLeft.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonUpperLeft.setBounds(130, 60, 60, 60);
		panelGame.add(buttonUpperLeft);

		JButton buttonUpperMiddle = new JButton("");
		buttonUpperMiddle.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonUpperMiddle.setBounds(190, 60, 60, 60);
		panelGame.add(buttonUpperMiddle);

		JButton buttonUpperRight = new JButton("");
		buttonUpperRight.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonUpperRight.setBounds(250, 60, 60, 60);
		panelGame.add(buttonUpperRight);

		JButton buttonMiddleLeft = new JButton("");
		buttonMiddleLeft.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonMiddleLeft.setBounds(130, 120, 60, 60);
		panelGame.add(buttonMiddleLeft);

		JButton buttonMiddleMiddle = new JButton("");
		buttonMiddleMiddle.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonMiddleMiddle.setBounds(190, 120, 60, 60);
		panelGame.add(buttonMiddleMiddle);

		JButton buttonMiddleRight = new JButton("");
		buttonMiddleRight.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonMiddleRight.setBounds(250, 120, 60, 60);
		panelGame.add(buttonMiddleRight);

		JButton buttonLowerLeft = new JButton("");
		buttonLowerLeft.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonLowerLeft.setBounds(130, 180, 60, 60);
		panelGame.add(buttonLowerLeft);

		JButton buttonLowerMiddle = new JButton("");
		buttonLowerMiddle.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonLowerMiddle.setBounds(190, 180, 60, 60);
		panelGame.add(buttonLowerMiddle);

		JButton buttonLowerRight = new JButton("");
		buttonLowerRight.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		buttonLowerRight.setBounds(250, 180, 60, 60);
		panelGame.add(buttonLowerRight);

		JLabel labelGameResultHeader = new JLabel("Tic Tac Toe");
		labelGameResultHeader.setHorizontalAlignment(SwingConstants.CENTER);
		labelGameResultHeader.setFont(new Font("Tahoma", Font.PLAIN, 26));
		labelGameResultHeader.setBounds(10, 11, 414, 44);
		panelGameResult.add(labelGameResultHeader);

		/* Rematch button */
		JButton buttonRematch = new JButton("Rematch");
		buttonRematch.setBounds(153, 159, 125, 25);
		panelGameResult.add(buttonRematch);

		/* Declare Button Event Handlers */
		/* Start Game Button Event Handler */
		buttonStartGame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				/* Reset the TicTacToe game board */
				controller.resetBoard();

				/* Update the active screen */
				panelGameStart.setVisible(false);
				panelGame.setVisible(true);
				panelGameResult.setVisible(false);
			}
		});

		/*
		 * Game Space Buttons
		 */
		buttonUpperLeft.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Record the move made for row 0 column 0 */
				controller.makeMove(currentPlayerTurn, 0, 0);

				/* Update GUI */
				buttonUpperLeft.setText(String.valueOf(currentPlayerTurn));
				buttonUpperLeft.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonUpperMiddle.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Record the move made for row 1 column 0 */
				controller.makeMove(currentPlayerTurn, 1, 0);

				/* Update GUI */
				buttonUpperMiddle.setText(String.valueOf(currentPlayerTurn));
				buttonUpperMiddle.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonUpperRight.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Record the move made for row 2 column 0 */
				controller.makeMove(currentPlayerTurn, 2, 0);

				/* Update GUI */
				buttonUpperRight.setText(String.valueOf(currentPlayerTurn));
				buttonUpperRight.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonMiddleLeft.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Record the move made for row 0 column 1 */
				controller.makeMove(currentPlayerTurn, 0, 1);

				/* Update GUI */
				buttonMiddleLeft.setText(String.valueOf(currentPlayerTurn));
				buttonMiddleLeft.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonMiddleMiddle.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Record the move made for row 1 column 1 */
				controller.makeMove(currentPlayerTurn, 1, 1);

				/* Update GUI */
				buttonMiddleMiddle.setText(String.valueOf(currentPlayerTurn));
				buttonMiddleMiddle.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonMiddleRight.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Record the move made for row 2 column 1 */
				controller.makeMove(currentPlayerTurn, 2, 1);

				/* Update GUI */
				buttonMiddleRight.setText(String.valueOf(currentPlayerTurn));
				buttonMiddleRight.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonLowerLeft.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Record the move made for row 0 column 2 */
				controller.makeMove(currentPlayerTurn, 0, 2);

				/* Update GUI */
				buttonLowerLeft.setText(String.valueOf(currentPlayerTurn));
				buttonLowerLeft.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonLowerMiddle.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Record the move made for row 1 column 2 */
				controller.makeMove(currentPlayerTurn, 1, 2);

				/* Update GUI */
				buttonLowerMiddle.setText(String.valueOf(currentPlayerTurn));
				buttonLowerMiddle.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonLowerRight.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				/* Record the move made for row 2 column 2 */
				controller.makeMove(currentPlayerTurn, 2, 2);

				/* Update GUI */
				buttonLowerRight.setText(String.valueOf(currentPlayerTurn));
				buttonLowerRight.setEnabled(false);

				/* Check if the game is over */
				if (true == controller.isGameOver())
				{
					/* Display the game outcome */
					displayGameOutcome();
				}
				else
				{
					/* Otherwise, update player turn labels */
					nextPlayerTurn();
				}
			}
		});

		buttonRematch.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/* Reset the TicTacToe game board */
				controller.resetBoard();

				/* Re-enable all buttons */
				buttonUpperLeft.setEnabled(true);
				buttonUpperMiddle.setEnabled(true);
				buttonUpperRight.setEnabled(true);
				buttonMiddleLeft.setEnabled(true);
				buttonMiddleMiddle.setEnabled(true);
				buttonMiddleRight.setEnabled(true);
				buttonLowerLeft.setEnabled(true);
				buttonLowerMiddle.setEnabled(true);
				buttonLowerRight.setEnabled(true);

				/* Clear text in all buttons */
				buttonUpperLeft.setText("");
				buttonUpperMiddle.setText("");
				buttonUpperRight.setText("");
				buttonMiddleLeft.setText("");
				buttonMiddleMiddle.setText("");
				buttonMiddleRight.setText("");
				buttonLowerLeft.setText("");
				buttonLowerMiddle.setText("");
				buttonLowerRight.setText("");

				/* Reset the current player turn to Player X */
				currentPlayerTurn = 'X';

				/* Update the active screen */
				panelGameStart.setVisible(false);
				panelGame.setVisible(true);
				panelGameResult.setVisible(false);
			}
		});
	}

	public void nextPlayerTurn()
	{
		/* Check if player 1 (X) */
		if ('X' == currentPlayerTurn)
		{
			/* set the current player to player 2 (O) */
			currentPlayerTurn = 'O';

			/*
			 * update player labels to tell the players it is now Player O's
			 * turn
			 */
			labelPlayerO.setFont(new Font("Tahoma", Font.BOLD, 16));
			labelPlayerO.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			labelPlayerX.setFont(new Font("Tahoma", Font.PLAIN, 16));
			labelPlayerX.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		}
		/* Otherwise player 2 (O) */
		else
		{
			/* set the current player to player 1 (X) */
			currentPlayerTurn = 'X';

			/*
			 * update player labels to tell the players it is now Player X's
			 * turn
			 */
			labelPlayerO.setFont(new Font("Tahoma", Font.PLAIN, 16));
			labelPlayerO.setBorder(new LineBorder(new Color(0, 0, 0), 0));
			labelPlayerX.setFont(new Font("Tahoma", Font.BOLD, 16));
			labelPlayerX.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		}
	}

	public void displayGameOutcome()
	{
		/* Get the game outcome */
		int gameResult = controller.getOutcome();

		/* Set the proper labels to show which player one the game */
		/* Check if player 1 won the game */
		if (1 == gameResult)
		{
			labelGameWinnerLine1.setText("Player X");
			labelGameWinnerLine2.setText("Won The Game");
		}
		/* Otherwise check if player 2 won the game */
		else if (2 == gameResult)
		{
			labelGameWinnerLine1.setText("Player O");
			labelGameWinnerLine2.setText("Won The Game");
		}
		/* Otherwise the game was a tie */
		else
		{
			labelGameWinnerLine1.setText("Game Ended");
			labelGameWinnerLine2.setText("In A Tie");
		}

		/* Set the active screen to be the game outcome */
		/* Update the active screen */
		panelGameStart.setVisible(false);
		panelGame.setVisible(false);
		panelGameResult.setVisible(true);
	}
}
