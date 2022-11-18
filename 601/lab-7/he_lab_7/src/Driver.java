/*
 
 	Driver.java -> L7.4

 */

public class Driver
{
	// -----------------------------------------------------------------
	// Creates a deck, shuffles the deck and deals the cards.
	// -----------------------------------------------------------------
	public static void main(String args[])
	{
		Deck deck = new Deck();
		int cardNumber = 1;

		deck.shuffle();

		while (!deck.isEmpty())
		{
			System.out.println(cardNumber + ": " + deck.deal());
			cardNumber++;
		}
	}
}
