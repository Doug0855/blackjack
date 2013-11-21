import java.util.Random;

public class Deck {
// 1-Clubs 2-Spades 3-Hearts 4-Diamonds
	public static Card[] deck = new Card[52];
	public static Card[] hand = new Card[11];
	public static Card[] newdeck = new Card[52];
	private int cardsUsed = 0;

	public Deck(Card[] cards) {
		cards = deck;
		this.cardsUsed = cardsUsed;
	}

	public static void populateDeck() {
		Card[] dek = new Card[deck.length];
		Card c;
		int count=0;
		for (int s=0; s<4; s++) {
			for (int v=2; v<15; v++) {
				c = new Card(s, v);
				dek[count] = c;
				count++;
			}
		}	
				

		setCards(dek);
	}

	public static void printDeck() {
		for (int i=0; i<deck.length; i++) {
			System.out.println(deck[i].getFace() + " " + deck[i].getSuitStr());
		}
	}

	public static void shuffle() {
		Random r = new Random();
		for (int i=deck.length-1; i>0; i--) {
			int index = r.nextInt(i+1);

			Card a = deck[index];
				deck[index] = deck[i];
				deck[i] = a;
		}
	}

	public static void setCards(Card[] c) {
		deck = c;
	}

	public String getPath(int pos) {
		String fc = null;
		String path = null;
		if (deck[pos].getSuit() <=10) {
			fc = deck[pos].getSuitStr();
		} else {
			switch(deck[pos].getSuit()) {
				case 11: fc = "J";
				break;

				case 12: fc = "Q";
				break;

				case 13: fc = "K";
				break;

				case 14: fc = "A";
			}
		}
		
		path = fc + deck[pos].getSuitStr();		
		return path;
	}

	public Card dealCard() {
		this.cardsUsed++;
		return deck[cardsUsed-1];
	}

}