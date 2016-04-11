// CSE 360 Project
// Name: PopItUp
// Description: BalloonGame extends JApplet and acts as the main
//				panel to control the CardLayout panel which switches
//				once a difficulty is specified or area is specified

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

 
@SuppressWarnings("serial")
public class BalloonGame extends JApplet
{
	private final int WIDTH = 2000, HEIGHT = 1000;
	private JPanel cards, wholePanel;
	private StartPanel start;
	private GamePanel game; 
	private JButton begin;

	
 public void init()
  {
    setSize (WIDTH, HEIGHT);
    
    cards= new JPanel(new CardLayout());
   
    start = new StartPanel();
    game = new GamePanel(); 
    
    wholePanel = new JPanel();
	
	begin = new JButton("Start!");
	begin.setFont(new Font("Serif", Font.BOLD, 30));
	
	ButtonGroup group = new ButtonGroup();
	group.add(begin);
	
	ButtonListener listener = new ButtonListener();
	begin.addActionListener(listener);
	
	wholePanel.setLayout(new GridLayout(1,3));

	wholePanel.add(begin);
	
	this.setLayout(new BorderLayout());
	this.add(wholePanel, BorderLayout.SOUTH);    
    this.add(cards, BorderLayout.CENTER);
    
    cards.add(start, "StartPanel");
    cards.add(game,"GamePanel");
    
    CardLayout card1 = (CardLayout)(cards.getLayout());
	card1.show(cards, "StartPanel");
		
  }
	 private class ButtonListener implements ActionListener
	 {
	  public void actionPerformed(ActionEvent event)
	   {
		  	Object source = event.getSource();
		  	
		  	if(source == begin)
		  	{
		  		CardLayout card1 = (CardLayout)(cards.getLayout());
		 	    card1.show(cards, "GamePanel");	
		  	}
		
	   } //end of actionPerformed method
	} //end of RadioButtonListener class
	 
 

}
