public class play {
// 0-Clubs 1-Spades 2-Hearts 3-Diamonds
	public static Card[] deck = new Card[52];
	public static Card[] hand = new Card[11];

	public static void main(String[] args) {
		deck = populateDeck(deck);
		printDeck(deck);
	}

	public static Card[] populateDeck(Card[] deck) {
		Card[] dek = new Card[deck.length];
		Card c;
		for (int i=0; i<4; i++) {
			for (int r=0; r<14; r++) {
				c = new Card(i, r);
				dek[i] = c;
			}
		}

		return dek;
	}

	public static void printDeck(Card[] deck) {
		for (int i=0; i<deck.length; i++) {
			System.out.print(deck[i].getFace() + " ");
			System.out.print(deck[i].getSuit());
		}
	}
}