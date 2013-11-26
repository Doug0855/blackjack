import java.awt.*;
import java.applet.*;

import javax.swing.*;
import java.awt.event.*;

public class buttonPanel extends JPanel implements ActionListener {
        private JButton hit, bet, reset;
        private JLabel label;
        private Blackjack blackjack;
        private int value = 0;

        public buttonPanel(Blackjack a) {
                super();
                label = new JLabel("Your bet value: " + value + "");
                label.setFont(new Font("Comic Sans MS", Font.BOLD, 32));  //because it's the funniest Font
                this.add(label);
                this.blackjack = a;
                buttonSetup();
        }

        public void buttonSetup() {
                String title = "Hit";
                hit = new JButton(title);
                hit.setActionCommand(title);
                hit.addActionListener(this);
                this.add(hit);

                title = "Bet +10";
                bet = new JButton(title);
                bet.setActionCommand(title);
                bet.addActionListener(this);
                this.add(bet);

                title = "Bet -10";
                bet = new JButton(title);
                bet.setActionCommand(title);
                bet.addActionListener(this);
                this.add(bet);

                title = "New game";
                reset = new JButton(title);
                reset.setActionCommand(title);
                reset.addActionListener(this);
                this.add(reset);
        }

        public void actionPerformed(ActionEvent ae) {
                if ("Bet +10".equals(ae.getActionCommand())) {
                        value = value + 10;
                        label.setText(value + "");
                        repaint();
                } else if ("Bet -10".equals(ae.getActionCommand())) {
                        value = value - 10;
                        label.setText(value + "");
                        repaint();
                }

                if ("Hit".equals(ae.getActionCommand())) {
                        if (blackjack.getValue() <= 21) {
                                blackjack.hit();
                        } 
                } else if ("New game".equals(ae.getActionCommand())) {
                        blackjack.reset();
                }
        }
}