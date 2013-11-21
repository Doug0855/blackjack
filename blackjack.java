
public class blackjack{

	public static Card[] c = new Card[52];
	public static Deck deck = new Deck(c);

	public static Hand playerHand = new Hand(deck);
	public static Hand dealerHand = new Hand(deck);

	public static Player player = new Player(playerHand);
	public static Player dealer = new Player(dealerHand);

	public static void main(String[] args) {
		deck.shuffle();

		player.deal();
		dealer.deal();
	}
}