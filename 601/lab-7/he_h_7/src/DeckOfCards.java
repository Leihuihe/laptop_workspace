import java.util.Random;

/* 
    DeckOfCards.java -> H7-4 
 */


public class DeckOfCards
{	
	// copy Lab 7's Deck code into this class
	private Card[] cards;
	private int numCards;

	// -----------------------------------------------------------------
	// Creates a full deck with the cards initially "in order".
	// -----------------------------------------------------------------
	public DeckOfCards()
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

	public void shuffle()
	{
		// add R. Sedgewick's video code (shown in Class 7)
//		Random rand = new Random();
		for(int i=0; i<numCards; i++)
		{
//			int r = rand.nextInt(i+1);
			int r = StdRandom.uniform(i+1);
			Card temp = cards[r];
			cards[r] = cards[i];
			cards[i] = temp;
		}
	}
	
	public String toString()
	{
		String toReturn = "";
		for(int i=0; i<numCards; i++)
		{
			toReturn = toReturn+ cards[i].toString() + '\n';
		}
		return toReturn;
	}
	
	public static void main(String[] args)
	{
		// put your 'driver class code' here
		DeckOfCards deck = new DeckOfCards();
		int cardNumber = 1;

		deck.shuffle();
		
		StdOut.println(deck);
//		while (!deck.isEmpty())
//		{
//			System.out.println(cardNumber + ": " + deck.deal());
//			cardNumber++;
//		}
	}

}
