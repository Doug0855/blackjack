public class Hand {

	private Card[] cards = new Card[7];

	public Hand(Deck deck) {
		cards = h;
		this.deck = deck;
		int cardCount = 0;
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

		for (int i=0; i<cards.length; i++) {
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
		for (int i=0; i<cards.length; i++) {
			System.out.println(cards[i].getFace() + " " + cards[i].getSuitStr());
		}
	}
}