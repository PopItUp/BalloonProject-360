import java.awt.Color;
import java.awt.Font;
//import GamePanel.ButtonListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

/** CSE 360 Project - GamePanel class
 * @author PopItUp
 * Description: GamePanel extends JPanel and is where the main game is played. It will
 * 			contain the button to roll the die, increment the score, and 
 * 			declare the winner of the game.
 * 
 */
public class GamePanel extends JPanel{

	ArrayList<String> players = new ArrayList<String>();
	private boolean won = false;
	private JPanel player1Panel, player2Panel, player3Panel, player4Panel; 
	private JLabel player1Label, player2Label, player3Label, player4Label; 
	private JLabel introLabel, player1Score, player2Score, player3Score, player4Score;
	private JLabel player1Balloon, player2Balloon, player3Balloon, player4Balloon; 
	private JLabel player1Dice, player2Dice, player3Dice, player4Dice; 
	private JButton player1Roll, player2Roll, player3Roll, player4Roll, resetButton, logoutButton;
	
	
	public GamePanel() {
		setBackground(new Color(51, 153, 255));
		
		player1Panel = new JPanel();
		player1Panel.setBackground(new Color(255, 102, 102));
		
		player2Panel = new JPanel();
		player2Panel.setBackground(new Color(255, 204, 102));
		
		player3Panel = new JPanel();
		player3Panel.setBackground(new Color(255, 102, 102));
		
		player4Panel = new JPanel();
		player4Panel.setBackground(new Color(255, 204, 102));
		
		resetButton = new JButton("Reset");
		logoutButton = new JButton("Logout");
		introLabel = new JLabel("New label");
		
		player1Label = new JLabel("Player 1");
		player1Label.setForeground(new Color(255, 255, 255));
		player1Label.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		player2Label = new JLabel("Player 2");
		player2Label.setForeground(new Color(255, 255, 255));
		player2Label.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		player3Label = new JLabel("Player 3");
		player3Label.setForeground(new Color(255, 255, 255));
		player3Label.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		player4Label = new JLabel("Player 4");
		player4Label.setForeground(new Color(255, 255, 255));
		player4Label.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		player1Balloon = new JLabel(new ImageIcon("balloonpops.gif"));
		player2Balloon = new JLabel(new ImageIcon("balloonpops.gif"));
		player3Balloon = new JLabel(new ImageIcon("balloonpops.gif"));
		player4Balloon = new JLabel(new ImageIcon("balloonpops.gif"));
		
		player1Balloon.setVisible(false);
		player2Balloon.setVisible(false);
		player3Balloon.setVisible(false);
		player4Balloon.setVisible(false);
		
		player1Dice = new JLabel(new ImageIcon("dice.gif"));
		player1Dice.setVisible(false);
		
		player2Dice = new JLabel(new ImageIcon("dice.gif"));
		player2Dice.setVisible(false);
		
		player3Dice = new JLabel(new ImageIcon("dice.gif"));
		player3Dice.setVisible(false);
		
		player4Dice = new JLabel(new ImageIcon("dice.gif"));
		player4Dice.setVisible(false);
		
		player1Score = new JLabel("Score: ");
		player1Score.setForeground(new Color(255, 255, 255));
		player1Score.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		player2Score = new JLabel("Score: ");
		player2Score.setForeground(new Color(255, 255, 255));
		player2Score.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		player3Score = new JLabel("Score: ");
		player3Score.setForeground(new Color(255, 255, 255));
		player3Score.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		player4Score = new JLabel("Score: ");
		player4Score.setForeground(new Color(255, 255, 255));
		player4Score.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		player1Roll = new JButton("Roll Dice");
		player2Roll = new JButton("Roll Dice");
		player3Roll = new JButton("Roll Dice");
		player4Roll = new JButton("Roll Dice");
		
		String  sText  = "<html>Instructions: Roll the die, if the die rolls to be even then the number is <br/> "
				+ "added on, otherwise if the die shows to be odd nothing is added. <br/> The first to 20 pops the balloon and wins!</html>";
		introLabel.setText (sText);
		introLabel.setForeground(new Color(255, 255, 255));
		introLabel.setFont(new Font("Marker Felt", Font.PLAIN, 15));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(player1Panel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(player2Panel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(player3Panel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(player4Panel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(resetButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(introLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(logoutButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(logoutButton)
								.addComponent(resetButton)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(introLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(player4Panel, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
						.addComponent(player3Panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(player2Panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(player1Panel, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		GroupLayout gl_player4Panel = new GroupLayout(player4Panel);
		gl_player4Panel.setHorizontalGroup(
			gl_player4Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(player4Label)
					.addGap(54))
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addGap(18)
					.addComponent(player4Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(player4Score, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_player4Panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(player4Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(player4Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_player4Panel.setVerticalGroup(
			gl_player4Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addGap(38)
					.addComponent(player4Label)
					.addGap(29)
					.addComponent(player4Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player4Roll)
					.addGap(18)
					.addComponent(player4Score)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(player4Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
		);
		player4Panel.setLayout(gl_player4Panel);
		
		GroupLayout gl_player3Panel = new GroupLayout(player3Panel);
		gl_player3Panel.setHorizontalGroup(
			gl_player3Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player3Panel.createSequentialGroup()
					.addGroup(gl_player3Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_player3Panel.createSequentialGroup()
							.addGap(55)
							.addComponent(player3Label))
						.addGroup(gl_player3Panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_player3Panel.createParallelGroup(Alignment.LEADING)
								.addComponent(player3Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(player3Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_player3Panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_player3Panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(player3Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(player3Score, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_player3Panel.setVerticalGroup(
			gl_player3Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player3Panel.createSequentialGroup()
					.addGap(41)
					.addComponent(player3Label)
					.addGap(23)
					.addComponent(player3Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player3Roll)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(player3Score)
					.addGap(18)
					.addComponent(player3Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		player3Panel.setLayout(gl_player3Panel);
		
		GroupLayout gl_player2Panel = new GroupLayout(player2Panel);
		gl_player2Panel.setHorizontalGroup(
			gl_player2Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player2Panel.createSequentialGroup()
					.addGroup(gl_player2Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_player2Panel.createSequentialGroup()
							.addGap(50)
							.addComponent(player2Label, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_player2Panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_player2Panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_player2Panel.createSequentialGroup()
									.addGap(6)
									.addComponent(player2Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addComponent(player2Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_player2Panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_player2Panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_player2Panel.createSequentialGroup()
									.addGap(6)
									.addComponent(player2Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
								.addComponent(player2Score, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_player2Panel.setVerticalGroup(
			gl_player2Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player2Panel.createSequentialGroup()
					.addGap(40)
					.addComponent(player2Label)
					.addGap(26)
					.addComponent(player2Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player2Roll)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(player2Score)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(player2Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		player2Panel.setLayout(gl_player2Panel);
		
		GroupLayout gl_player1Panel = new GroupLayout(player1Panel);
		gl_player1Panel.setHorizontalGroup(
			gl_player1Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player1Panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_player1Panel.createParallelGroup(Alignment.LEADING)
						.addComponent(player1Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(player1Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(player1Roll))
					.addGap(20))
				.addGroup(gl_player1Panel.createSequentialGroup()
					.addGap(49)
					.addComponent(player1Label)
					.addContainerGap(70, Short.MAX_VALUE))
				.addGroup(gl_player1Panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(player1Score, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addGap(20))
		);
		gl_player1Panel.setVerticalGroup(
			gl_player1Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player1Panel.createSequentialGroup()
					.addGap(40)
					.addComponent(player1Label)
					.addGap(31)
					.addComponent(player1Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player1Roll)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(player1Score)
					.addGap(22)
					.addComponent(player1Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
		);
		player1Panel.setLayout(gl_player1Panel);
		setLayout(groupLayout);
		
		ButtonListener listener = new ButtonListener();
		player1Roll.addActionListener(listener);
		player2Roll.addActionListener(listener);
		player3Roll.addActionListener(listener);
		player4Roll.addActionListener(listener);
	    resetButton.addActionListener(listener);
	}
		
	/** ButtonListener will keep track of when the "roll die" JButton has been pressed, and will then update all the scores for the players in the game until someone wins.
	 * @author PopItUp
	 * @param event - The event in which the "roll die" button has been pressed
	 */
		private class ButtonListener implements ActionListener
			{
				public void actionPerformed (ActionEvent event)
				{
					int x = (int)(Math.random() * 10);
					Object source = event.getSource();
					if(source == player1Roll)
					{
						player1Dice.setVisible(true);
						player2Dice.setVisible(false);
						player3Dice.setVisible(false);
						player4Dice.setVisible(false);
						Player.addRoll(1);
						Player.testAdd(1, x);
						if(Player.returnSumPlayer(1) >= 20 && won == false)
						{
							Player.addGame();
							player1Score.setText("Iron Man:" + Player.returnSumPlayer(1));
							introLabel.setText("Iron Man WINS!");
							player1Balloon.setVisible(true);
							introLabel.setForeground(new Color(255, 255, 255));
							introLabel.setFont(new Font("Marker Felt", Font.PLAIN, 32));
							won = true;
							Player.addWin(1);
							Player.setRanks(1, 1);
							Player.adjustRanks(1);
						}
						else{
							player1Score.setHorizontalAlignment(SwingConstants.CENTER);
							player1Score.setVerticalAlignment(SwingConstants.CENTER);
							player1Score.setText("Ironman:" + Player.returnSumPlayer(1));
						}
					}
					else if(source == player2Roll)
					{
						player1Dice.setVisible(false);
						player2Dice.setVisible(true);
						player3Dice.setVisible(false);
						player4Dice.setVisible(false);
						
						Player.addRoll(2);
						Player.testAdd(2, x);
						if(Player.returnSumPlayer(2) >= 20 && won == false)
						{
							Player.addGame();
							player2Score.setText("Captain America:" + Player.returnSumPlayer(2));
							introLabel.setText("Captain America WINS!");
							player2Balloon.setVisible(true);
							introLabel.setForeground(new Color(255, 255, 255));
							introLabel.setFont(new Font("Marker Felt", Font.PLAIN, 32));
							won = true;
							Player.addWin(2);
							Player.setRanks(2, 1);
							Player.adjustRanks(2);
						}	
						else
							player2Score.setText("Captain America:" + Player.returnSumPlayer(2));
					}
					else if(source == player3Roll)
					{
						player1Dice.setVisible(false);
						player2Dice.setVisible(false);
						player3Dice.setVisible(true);
						player4Dice.setVisible(false);
						Player.addRoll(3);
						Player.testAdd(3, x);
						if(Player.returnSumPlayer(3) >= 20 && won == false)
						{
							Player.addGame();
							player3Score.setText("Black Widow:" + Player.returnSumPlayer(3));
							introLabel.setText("Black Widow Wins!!");
							player3Balloon.setVisible(true);
							introLabel.setForeground(new Color(255, 255, 255));
							introLabel.setFont(new Font("Marker Felt", Font.PLAIN, 32));
							won = true;
							Player.addWin(3);
							Player.setRanks(3, 1);
							Player.adjustRanks(3);
						}
						else
							player3Score.setText("Black Widow:"  + Player.returnSumPlayer(3));
					}
					else if(source == player4Roll)
					{
						player1Dice.setVisible(false);
						player2Dice.setVisible(false);
						player3Dice.setVisible(false);
						player4Dice.setVisible(true);
						Player.addRoll(4);
						Player.testAdd(4, x);
						if(Player.returnSumPlayer(4) >= 20 && won == false)
						{
							Player.addGame();
							player4Score.setText("Spiderman:" + Player.returnSumPlayer(4));
							introLabel.setText("SpiderMan Wins!");
							player4Balloon.setVisible(true);
							introLabel.setForeground(new Color(255, 255, 255));
							introLabel.setFont(new Font("Marker Felt", Font.PLAIN, 32));
							won = true;
							Player.addWin(4);
							Player.setRanks(4, 1);
							Player.adjustRanks(4);
						}
						else
							player4Score.setText("Spiderman:" + Player.returnSumPlayer(4));
					}
					else if(source == resetButton)
					{
						player1Dice.setVisible(false);
						player2Dice.setVisible(false);
						player3Dice.setVisible(false);
						player4Dice.setVisible(false);
						
						player1Balloon.setVisible(false);
						player2Balloon.setVisible(false);
						player3Balloon.setVisible(false);
						player4Balloon.setVisible(false);
						
						player1Score.setText(" " + Player.returnResetSum(1));
						player2Score.setText(" " + Player.returnResetSum(2));
						player3Score.setText(" " + Player.returnResetSum(3));
						player4Score.setText(" " + Player.returnResetSum(4));
						won = false;
						String  sText  = "<html>Instructions: Roll the die, if the die rolls to be even then the number is <br/> "
								+ "added on, otherwise if the die shows to be odd nothing is added. <br/> The first to 20 pops the balloon and wins!</html>";
						introLabel.setText (sText);
						introLabel.setForeground(new Color(255, 255, 255));
						introLabel.setFont(new Font("Marker Felt", Font.PLAIN, 15));
					}
					
					updateUI();
				}
			}

	}
