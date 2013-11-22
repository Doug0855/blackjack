import java.awt.*;
import java.awt.event.*;
import java.awt.applet.*;

public class blackjack extends Applet{

	public static Card[] c = new Card[52];
	public static Deck deck = new Deck(c);

	public static Hand playerHand = new Hand(deck);
	public static Hand dealerHand = new Hand(deck);

	public static Player player = new Player(playerHand);
	public static Player dealer = new Player(dealerHand);

	private boolean playerTurn;
	private int outcome;
	private ButtonPannel pannel;

	public void init() {
		this.deck = new Deck();
		this.pannel = new ButtonPannel;
		this.add(this.pannel);
		play();       
	}

	public boolean aiCanPlay(){
		return this.aiCanPlay;
	}

	public int getValue(){
	    return this.player.getValue();
	}

	public void reset(){
	    play();
	}  

	public void play(){
	    this.aiCanPlay = true;
	    this.outcome = 3;
	    this.deck.shuffle();
	    this.player = new Player(deck, 50);
	    this.ai = new Dealer(deck, 450);
	    System.out.println("initilized");
	    repaint();
	}
}