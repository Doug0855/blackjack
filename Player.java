public class Player {

	private Hand hand;
	public int money = 100;

	public Player(Hand hand) {
		this.hand = hand;
		this.money = money;
	}

	public void hit() {
		hand.hit();
	}

	public void printCards() {
		hand.printCards();
	}

	public int getValue() {
		return hand.getValue();
	}

	public void deal() {
		hand.deal();
	}

	public void bet(int amount) {
		money = money - amount;
	}

	public void pay(int amount) {
		money = money + amount;
	}

	public int getMoney() {
		return money;
	}


}