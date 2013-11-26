import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Blackjack extends Applet{

	public static Card[] c = new Card[52];
	public static Deck deck = new Deck(c);

	public static Hand playerHand = new Hand(deck, false);
	public static Hand dealerHand = new Hand(deck, true);

	public static Player player = new Player(playerHand);
	public static Player dealer = new Player(dealerHand);

	private boolean playerTurn;
	private int outcome;
	private ButtonPanel pannel;

	public void init() {    
	}

	public boolean aiCanPlay(){
	}

	public int getValue(){
	}

	public void reset(){
	}  

	public void play(){
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 1000, 1000);
	} 
}