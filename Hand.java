import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

public class Hand {

	private int cardCount = 0;
	private Card[] cards = new Card[12];
	private Deck deck;

	public Hand(Deck deck, boolean isdealer) {
		this.deck = deck;
		this.cardCount = cardCount; //number of cards in the hand

		if (isdealer) {  //if the hand is a dealer hand, it is displayed at the bottom of the screen, player at the top
			this.yoffset = 800;
		} else {
			this.yoffset = 100;  
		}
	}

	public void deal() {  //deals 2 cards to each hand
		cards[cardCount] = deck.dealCard();
		cardCount++;
		cards[cardCount] = deck.dealCard();
		cardCount++;
	}

	public void hit() {  //deals 1 card to the hand
		cards[cardCount] = deck.dealCard();
		cardCount++;
	}

	public int getValue() { //returns the total value of every card in the hand
		int value = 0;
		int acecount = 0;

		for (int i=0; i<cardCount; i++) {
			if (cards[i].getCard() <= 10) { //number cards worth face value
				value += cards[i].getCard();
			} else if (cards[i].getCard() < 14) {  // face cards worth 10
				value += 10;
			} else {
				value += 11;  // aces worth 11 initially
				acecount++;
			}
		}

		if (value > 21) {
			value = value - 10*acecount;  //if the hand is worth more than 21, the aces are worth 1, so it subtracts 10 for each ace
		}

		return value;
	} 

	public void printCards() {
		for (int i=0; i < cardCount; i++) {
			System.out.println(cards[i].getFace() + " " + cards[i].getSuitStr()); //prints the cards into the terminal for testing purposes
		}
	}

	public void draw(Graphics g) {  //draws the hand onto the screen
		for (int i=0; i<cardCount; i++) {
			cards[i].draw(g, 72/2*i, yoffset, null);
		}
	}
}