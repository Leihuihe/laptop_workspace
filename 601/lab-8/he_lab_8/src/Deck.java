/*
 
 	Deck.java -> L7.4

 */

import java.util.Random;

public class Deck
{
	private Card[] cards;
	private int numCards;

	// -----------------------------------------------------------------
	// Creates a full deck with the cards initially "in order".
	// -----------------------------------------------------------------
	public Deck()
	{
		this.cards = new Card[52];

		int cardIndex = 0;

		for (Card.RANK rank : Card.RANK.values())
		{
			for (Card.SUIT suit : Card.SUIT.values())
			{
				this.cards[cardIndex++] = new Card(rank, suit);
			}
		}

		this.numCards = cardIndex;
		// for (int rank = Card.ACE; rank <= Card.KING; rank++)
		// for (int suit = Card.CLUBS; suit <= Card.SPADES; suit++)
		// cards[cardIndex++] = new CardRefactored(rank, suit);
	}

	// -----------------------------------------------------------------
	// Deals one card from the deck.
	// -----------------------------------------------------------------
	public Card deal()
	{
		// finish this

		Card topCard = this.cards[numCards - 1];
		numCards--; // don't remove card, just decrement count==index of top
					// card
		return topCard;
	}

	// -----------------------------------------------------------------
	// Returns the number of cards left in the deck.
	// -----------------------------------------------------------------
	public int getNumCardsInDeck()
	{
		// is this.numCards updated anywhere? Hmmm....

		return this.numCards;
	}

	// -----------------------------------------------------------------
	// Returns true is the deck has cards in it, else false.
	// -----------------------------------------------------------------
	public boolean isEmpty()
	{
		// finish this

		return numCards == 0;
	}

	// -----------------------------------------------------------------
	// Shuffles the deck by swapping random pairs of cards many times.
	// -----------------------------------------------------------------
	public void shuffle()
	{
		/*
		 * finish this as follows:
		 * 
		 * repeat a random # of times between 1000 and 2000: pick two Cards in
		 * Deck at random swap them within the Deck
		 */

	}

	// add a toString() method: it should return a String with
	// each Card's toString() concatenated together, separated
	// by newlines (\n)

	public String toString()
	{
		// finish this
		String toReturn = "";
		for(int cardNum=this.numCards-1; cardNum>=0; cardNum--)
		{
			Card theCard = this.cards[cardNum];
			toReturn += theCard.toString() + "\n";
		}
		return toReturn;
	}

	public static void main(String[] args)
	{
		Deck d = new Deck();
		StdOut.println(d);

	}

}
