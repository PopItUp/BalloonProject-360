import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/** CSE 360 Project - GamePanel class
 * @author PopItUp
 * Description: GamePanel is a panel created to feature a 
 *				the PopItUp game
 */
public class GamePanel extends JPanel
{
	private JPanel wholePanel, winPanel, rollPanel, rollEntirePanel;
	private JButton victory, rollDicePlayer1, rollDicePlayer2, rollDicePlayer3, rollDicePlayer4;
	private JLabel win, test, player1, player2, player3, player4, test2;
	private int count1, count2, count3, count4;
	private Dice Pl1, Pl2, Pl3, Pl4;
	private boolean won = false;
	
	/** GamePanel - constructor that initializes and sets all the instance variables **/ 
	public GamePanel()
	{

		wholePanel = new JPanel();
		winPanel = new JPanel();
		rollPanel = new JPanel();
		rollEntirePanel = new JPanel();
		test = new JLabel("Instructions: Roll the die, if the die rolls to be even then the number is\n "
				+ "added on, otherwise if the die shows to be odd nothing is added. The first to 20 pops the balloon and wins!");
		test2 = new JLabel(" ");
		
		rollDicePlayer1 = new JButton("Roll for Player 1");
		rollDicePlayer2 = new JButton("Roll for Player 2");
		rollDicePlayer3 = new JButton("Roll for Player 3");
		rollDicePlayer4 = new JButton("Roll for Player 4");
		
		player1 = new JLabel("Player1");
		player1.setHorizontalAlignment(SwingConstants.CENTER);
		player1.setVerticalAlignment(SwingConstants.CENTER);
		player2 = new JLabel("Player2");
		player2.setHorizontalAlignment(SwingConstants.CENTER);
		player2.setVerticalAlignment(SwingConstants.CENTER);
		player3 = new JLabel("Player3");
		player3.setHorizontalAlignment(SwingConstants.CENTER);
		player3.setVerticalAlignment(SwingConstants.CENTER);
		player4 = new JLabel("Player4");
		player4.setHorizontalAlignment(SwingConstants.CENTER);
		player4.setVerticalAlignment(SwingConstants.CENTER);
		
		wholePanel.setLayout(new GridLayout(2,1));
		wholePanel.add(test);
		
		rollEntirePanel.setLayout(new FlowLayout());
		rollEntirePanel.add(test2);
		rollEntirePanel.add(rollPanel);
		
		rollPanel.setLayout(new GridLayout(4,1));
		rollPanel.add(rollDicePlayer1);
		rollPanel.add(rollDicePlayer2);
		rollPanel.add(player1);
		rollPanel.add(player2);
		rollPanel.add(rollDicePlayer3);
		rollPanel.add(rollDicePlayer4);
		rollPanel.add(player3);
		rollPanel.add(player4);
		
		setLayout(new GridLayout(1,1));
		add(wholePanel);
		wholePanel.add(rollPanel);

		ButtonListener listener = new ButtonListener();
		rollDicePlayer1.addActionListener(listener);
		rollDicePlayer2.addActionListener(listener);
		rollDicePlayer3.addActionListener(listener);
		rollDicePlayer4.addActionListener(listener);
	}

	/** ButtonListener - class that implements ActionListener to account for button clicks **/ 
	private class ButtonListener implements ActionListener
		{
			public void actionPerformed (ActionEvent event)
			{
				int x = (int)(Math.random() * 10);
				Object source = event.getSource();
				if(source == victory){
					winPanel.setVisible(true);
				}
				else if(source == rollDicePlayer1)
				{
					Player.testAdd(1, x);
					if(Player.returnSumPlayer(1) >= 20 && won == false)
					{
						player1.setText("Player 1:" + Player.returnSumPlayer(1));
						test.setText("Player 1 WINS!");
						test.setFont(new Font("Serif", Font.BOLD, 80));
						test.setHorizontalAlignment(SwingConstants.CENTER);
						test.setVerticalAlignment(SwingConstants.CENTER);
						won = true;
					}
					else
						player1.setHorizontalAlignment(SwingConstants.CENTER);
						player1.setVerticalAlignment(SwingConstants.CENTER);
						player1.setText("Player 1:" + Player.returnSumPlayer(1));
				}
				else if(source == rollDicePlayer2)
				{
					Player.testAdd(2, x);
					if(Player.returnSumPlayer(2) >= 20 && won == false)
					{
						player2.setText("Player 2:" + Player.returnSumPlayer(2));
						test.setText("Player 2 WINS!");
						test.setFont(new Font("Serif", Font.BOLD, 80));
						test.setHorizontalAlignment(SwingConstants.CENTER);
						test.setVerticalAlignment(SwingConstants.CENTER);
						won = true;
					}	
					else
						player2.setText("Player 2:" + Player.returnSumPlayer(2));
				}
				else if(source == rollDicePlayer3)
				{
					Player.testAdd(3, x);
					if(Player.returnSumPlayer(3) >= 20 && won == false)
					{
						player3.setText("Player 3:" + Player.returnSumPlayer(3));
						test.setText("Player 3 WINS!");
						test.setFont(new Font("Serif", Font.BOLD, 80));
						test.setHorizontalAlignment(SwingConstants.CENTER);
						test.setVerticalAlignment(SwingConstants.CENTER);
						won = true;
					}
					else
						player3.setText("Player 3:" + Player.returnSumPlayer(3));
				}
				else if(source == rollDicePlayer4)
				{
					Player.testAdd(4, x);
					if(Player.returnSumPlayer(4) >= 20 && won == false)
					{
						player4.setText("Player 4:" + Player.returnSumPlayer(4));
						test.setText("Player 4 WINS!");
						test.setFont(new Font("Serif", Font.BOLD, 80));
						test.setHorizontalAlignment(SwingConstants.CENTER);
						test.setVerticalAlignment(SwingConstants.CENTER);
						won = true;
					}
					else
						player4.setText("Player 4:" + Player.returnSumPlayer(4));
				}
				
				updateUI();
			}
		}



}