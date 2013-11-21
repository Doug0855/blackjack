public class Hand {

	private int cardCount = 0;
	private Card[] cards = new Card[12];
	private Deck deck;

	public Hand(Deck deck) {
		this.deck = deck;
		this.cardCount = cardCount;
	}

	public void deal() {
		cards[cardCount] = deck.dealCard();
		cardCount++;
		cards[cardCount] = deck.dealCard();
		cardCount++;
	}

	public void hit() {
		cards[cardCount] = deck.dealCard();
		cardCount++;
	}

	public int getValue() {
		int value = 0;
		int acecount = 0;

		for (int i=0; i<cardCount; i++) {
			if (cards[i].getCard() <= 10) {
				value += cards[i].getCard();
			} else if (cards[i].getCard() < 14) {
				value += 10;
			} else {
				value += 11;
				acecount++;
			}
		}

		if (value > 21) {
			value = value - 10*acecount;
		}

		return value;
	} 

	public void printCards() {
		for (int i=0; i < cardCount; i++) {
			System.out.println(cards[i].getFace() + " " + cards[i].getSuitStr());
		}
	}
}