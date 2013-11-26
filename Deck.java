import java.util.Random;

public class Deck {
// 1-Clubs 2-Spades 3-Hearts 4-Diamonds
	public static Card[] deck = new Card[52];
	public static Card[] hand = new Card[11];
	public static Card[] newdeck = new Card[52];
	private int cardsUsed = 0;

	public Deck(Card[] cards) {
		cards = deck;
		this.cardsUsed = cardsUsed; //the the position of the top card of the deck
	}

	public void populateDeck() {
		Card[] dek = new Card[deck.length];
		Card c;
		int count=0;
		for (int s=0; s<4; s++) {  //runs through each suit and generates 14 cards
			for (int v=2; v<15; v++) {
				c = new Card(s, v, true);
				dek[count] = c;
				count++;
			}
		}	
				

		setCards(dek);
	}

	public void printDeck() {  //prints the cards into the terminal for testing purposes
		for (int i=0; i<deck.length; i++) {
			System.out.println(deck[i].getFace() + " " + deck[i].getSuitStr());
		}
	}

	public void shuffle() { //shuffles deck
		Random r = new Random();
		for (int i=deck.length-1; i>0; i--) {
			int index = r.nextInt(i+1);

			Card a = deck[index];
				deck[index] = deck[i];
				deck[i] = a;
		}
	}

	public void setCards(Card[] c) {  //if the deck ever needed to be changed
		deck = c;
	}


	public Card dealCard() { //used to deal cards into hands
		this.cardsUsed++;
		return deck[cardsUsed-1];
	}

}