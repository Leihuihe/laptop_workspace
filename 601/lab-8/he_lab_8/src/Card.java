/* 
    CardRefactored.java

	Refactors original Card,
		replacing final static ints
		with enums RANK and SUIT
 */

public class Card
{
	public enum RANK
	{
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	};

	// public final static int ACE = 1;
	// public final static int TWO = 2;
	// public final static int THREE = 3;
	// public final static int FOUR = 4;
	// public final static int FIVE = 5;
	// public final static int SIX = 6;
	// public final static int SEVEN = 7;
	// public final static int EIGHT = 8;
	// public final static int NINE = 9;
	// public final static int TEN = 10;
	// public final static int JACK = 11;
	// public final static int QUEEN = 12;
	// public final static int KING = 13;

	public enum SUIT
	{
		Clubs, Diamonds, Hearts, Spades
	};

	// public final static int CLUBS = 1;
	// public final static int DIAMONDS = 2;
	// public final static int HEARTS = 3;
	// public final static int SPADES = 4;

	// private final static int NUM_FACES = 13;

	private final static int NUM_RANKS = RANK.values().length; // 13;
	private final static int NUM_SUITS = SUIT.values().length; // 4;

	// private int face, suit;

	private SUIT suit2;
	private RANK rank;

	// private String faceName, suitName;

	// -----------------------------------------------------------------
	// Creates a random card.
	// -----------------------------------------------------------------
	public Card()
	{
		// face = (int) (Math.random() * NUM_FACES) + 1;
		// setFaceName();

		int rankOrdValue = (int) (Math.random() * NUM_RANKS) + 1;
		rank = RANK.values()[rankOrdValue];

		// suit = (int) (Math.random() * NUM_SUITS) + 1;
		// setSuitName();

		int suitOrdValue = (int) (Math.random() * NUM_SUITS) + 1;
		suit2 = SUIT.values()[suitOrdValue];

	}

	// -----------------------------------------------------------------
	// Creates a card of the specified suit and face value.
	// -----------------------------------------------------------------
	// public CardRefactored(int faceValue, int suitValue)

	public Card(RANK rank, SUIT suit)
	{
		// face = faceValue;
		// setFaceName();
		this.rank = rank;

		// suit = suitValue;
		// setSuitName();

		this.suit2 = suit;

	}

	// -----------------------------------------------------------------
	// Sets the string representation of the face using its stored
	// numeric value.
	// -----------------------------------------------------------------

	// private void setFaceName()
	// {
	// switch (face)
	// {
	// case ACE:
	// faceName = "Ace";
	// break;
	// case TWO:
	// faceName = "Two";
	// break;
	// case THREE:
	// faceName = "Three";
	// break;
	// case FOUR:
	// faceName = "Four";
	// break;
	// case FIVE:
	// faceName = "Five";
	// break;
	// case SIX:
	// faceName = "Six";
	// break;
	// case SEVEN:
	// faceName = "Seven";
	// break;
	// case EIGHT:
	// faceName = "Eight";
	// break;
	// case NINE:
	// faceName = "Nine";
	// break;
	// case TEN:
	// faceName = "Ten";
	// break;
	// case JACK:
	// faceName = "Jack";
	// break;
	// case QUEEN:
	// faceName = "Queen";
	// break;
	// case KING:
	// faceName = "King";
	// break;
	// }
	// }

	// -----------------------------------------------------------------
	// Sets the string representation of the suit using its stored
	// numeric value.
	// -----------------------------------------------------------------

	// private void setSuitName()
	// {
	// switch (suit)
	// {
	// case CLUBS:
	// suitName = "Clubs";
	// break;
	// case DIAMONDS:
	// suitName = "Diamonds";
	// break;
	// case HEARTS:
	// suitName = "Hearts";
	// break;
	// case SPADES:
	// suitName = "Spades";
	// break;
	// }
	// }

	// -----------------------------------------------------------------
	// Determines if this card is higher than the passed card. The
	// second parameter determines if aces should be considered high
	// (beats a King) or low (lowest of all cards). Uses the suit
	// if both cards have the same face.
	// -----------------------------------------------------------------
	public boolean isHigherThan(Card card2, boolean aceHigh)
	{
		boolean result = false;

		// if (face == card2.getFace())
		if (rank == card2.rank)
		{
			if (suit2.ordinal() > card2.getSuit().ordinal())
				result = true;
		}
		else
		{
			if (aceHigh && rank == RANK.Ace)
				result = true;
			else if (rank.ordinal() > card2.getRank().ordinal())
				result = true;
		}

		return result;
	}

	// -----------------------------------------------------------------
	// Determines if this card is higher than the passed card,
	// assuming that aces should be considered high.
	// -----------------------------------------------------------------
	public boolean isHigherThan(Card card2)
	{
		return isHigherThan(card2, true);
	}

	// -----------------------------------------------------------------
	// Returns the face (numeric value) of this card.
	// -----------------------------------------------------------------
	// public RANK getFace()
	public RANK getRank()
	{
		// return face;
		return rank;
	}

	// -----------------------------------------------------------------
	// Returns the suit (numeric value) of this card.
	// -----------------------------------------------------------------
	public SUIT getSuit()
	{
		// return suit;
		return suit2;
	}

	// -----------------------------------------------------------------
	// Returns the face (string value) of this card.
	// -----------------------------------------------------------------
	public String getFaceName()
	{
		// return faceName;
		return rank.name();
	}

	// -----------------------------------------------------------------
	// Returns the suit (string value) of this card.
	// -----------------------------------------------------------------
	public String getSuitName()
	{
		// return suitName;
		return suit2.name();
	}

	// -----------------------------------------------------------------
	// Returns the string representation of this card, including
	// both face and suit.
	// -----------------------------------------------------------------
	public String toString()
	{
		// return faceName + " of " + suitName;
		return rank.name() + " of " + suit2.name();
	}
}
