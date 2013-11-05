public class Card {
	private int suit;
	private int card;
	private int value;
	private String face;
	private String suiter;

	public Card(int suit, int card) {
		suit = this.suit;
		card = this.card;


		if (card <= 10) {
			value = card;
		} else {
			value = 10;
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

	public String getFace() {
		String face = null;
		if (card <=10) {
			face = Integer.toString(card);
		} else {
			switch(card) {
				case 11: face = "Jack";
				break;

				case 12: face = "Queen";
				break;

				case 13: face = "King";
				break;

				case 14: face = "Ace";
				break;
			}
		}

		return face;
	}

}