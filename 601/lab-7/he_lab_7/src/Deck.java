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
		cards = new Card[52];

		int cardIndex = 0;
		for (int face = Card.ACE; face <= Card.KING; face++)
			for (int suit = Card.CLUBS; suit <= Card.SPADES; suit++)
				cards[cardIndex++] = new Card(face, suit);
		numCards = 52;
	}

	// -----------------------------------------------------------------
	// Deals one card from the deck.
	// -----------------------------------------------------------------
	public Card deal()
	{
		// finish this
		Card topCard = cards[numCards-1];
		numCards--;
		
		return topCard; // no Card at all!
	}

	// -----------------------------------------------------------------
	// Returns the number of cards left in the deck.
	// -----------------------------------------------------------------
	public int getNumCardsInDeck()
	{
		// is this.numCards updated anywhere?  Hmmm....
		
		return this.numCards;
	}

	// -----------------------------------------------------------------
	// Returns true is the deck has cards in it, else false.
	// -----------------------------------------------------------------
	public boolean isEmpty()
	{
		// finish this
		
		return numCards==0;
	}

	// -----------------------------------------------------------------
	// Shuffles the deck by swapping random pairs of cards many times.
	// -----------------------------------------------------------------
	public void shuffle()
	{
		/* 
		   finish this as follows:
		 
		 	repeat a random # of times between 1000 and 2000:
				pick two Cards in Deck at random
				swap them within the Deck
		*/
		Random rand = new Random();
		int randTimes = rand.nextInt(1000,2001);
		for(int times=0; times<=randTimes; times++)
		{
			int index1 = rand.nextInt(0,52);
//			int index2 = rand.nextInt(0,52);
//			if(index1 != index2)
//			{
//				Card temp = cards[index1];
//				cards[index1] = cards[index2];
//				cards[index2] = temp;
//			}
			Card temp = cards[index1];
			cards[index1] = cards[times%52];
			cards[times%52] = temp;
		}

	}
}