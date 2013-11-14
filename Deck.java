import java.util.Random;

public class Deck {
// 1-Clubs 2-Spades 3-Hearts 4-Diamonds
	public static Card[] deck = new Card[52];
	public static Card[] hand = new Card[11];
	public static Card[] newdeck = new Card[52];

	public Deck(Card[] cards) {
		cards = deck;
	}

	public static Card[] populateDeck() {
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
				

		return dek;
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

}