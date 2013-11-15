
public class blackjack{

	public static Card[] c = new Card[52];
	public static Deck deck = new Deck(c);

	public static void main(String[] args) {
		deck.populateDeck();
		deck.printDeck();
		deck.shuffle();
		deck.printDeck();

		String s = null;
		for (int i=0; i<c.length; i++) {
			s = c[i].getPath();
			System.out.println(s);
		}
	}
}