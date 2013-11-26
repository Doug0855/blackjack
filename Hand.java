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
		this.cardCount = cardCount;

		if (isdealer) {
			this.yoffset = 800;
		} else {
			this.yoffset = 100;
		}
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

	public void draw(Graphics g) {
		for (int i=0; i<cardCount; i++) {
			cards[i].draw(g, 72/2*i, yoffset, null);
		}
	}
}