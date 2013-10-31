public class Card {
	private int suit;
	private int card;
	private int value;
	private String face;
	private String suiter

	public Card(int suit, int card) {
		suit = this.suit;
		card = this.card;


		if (card <= 10) {
			value = card;
		} else {
			value = 10;
		}

		if (card <=10) {
			face = card.toString();
		} else {
			switch()
		}


	}

	public void setSuit(int sweet) {
		suit = sweet;
	}

	public int getSuit() {
		return suit;
	}

	public void setCard(int kard) {
		card = kard;
	}

	public int getCard() {
		return card;
	}

}