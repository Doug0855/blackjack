
public class blackjack{

	public static Card[] cards = new Card[52];
	public static Deck deck = new Deck(cards);

	public static void main(String[] args) {
		deck.populateDeck();
		deck.printDeck();
		deck.shuffle();
		deck.printDeck();
	}
}