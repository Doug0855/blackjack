
public class blackjack{

	public static Card[] c = new Card[52];
	public static Deck deck = new Deck(c);

	public static void main(String[] args) {
		deck.populateDeck();
		deck.shuffle();
		deck.printDeck();

		Hand h = new Hand(deck);
		h.deal();
		h.printCards();
		h.hit();
		h.printCards();
		System.out.println(h.getValue());
	}
}