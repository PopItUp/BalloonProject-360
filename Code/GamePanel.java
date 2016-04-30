import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

//import GamePanel.ButtonListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JLabel;
import javax.swing.JButton;

public class GamePanel extends JPanel{

	/**
	 * Create the panel.
	 */
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
		player2Label = new JLabel("Player 2");
		player3Label = new JLabel("Player 3");
		player4Label = new JLabel("Player 4");
		
		player1Balloon = new JLabel("Picture Here");
		player2Balloon = new JLabel("Picture Here");
		player3Balloon = new JLabel("Picture Here");
		player4Balloon = new JLabel("Picture Here");
		
		player1Dice = new JLabel("Picture Here");
		player2Dice = new JLabel("Picture Here");
		player3Dice = new JLabel("Picture Here");
		player4Dice = new JLabel("Picture Here");
		
		player1Score = new JLabel("Score: ");
		player2Score = new JLabel("Score: ");
		player3Score = new JLabel("Score: ");
		player4Score = new JLabel("Score: ");
		
		player1Roll = new JButton("Roll Dice");
		player2Roll = new JButton("Roll Dice");
		player3Roll = new JButton("Roll Dice");
		player4Roll = new JButton("Roll Dice");
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
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
							.addComponent(introLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
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
					.addContainerGap(57, Short.MAX_VALUE)
					.addComponent(player4Label)
					.addGap(54))
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addGap(28)
					.addComponent(player4Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_player4Panel.createParallelGroup(Alignment.LEADING)
						.addComponent(player4Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(player4Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(player4Score, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_player4Panel.setVerticalGroup(
			gl_player4Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player4Panel.createSequentialGroup()
					.addGap(38)
					.addComponent(player4Label)
					.addGap(29)
					.addComponent(player4Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(player4Roll)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player4Score)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player4Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		player4Panel.setLayout(gl_player4Panel);
		
		GroupLayout gl_player3Panel = new GroupLayout(player3Panel);
		gl_player3Panel.setHorizontalGroup(
			gl_player3Panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_player3Panel.createSequentialGroup()
					.addGroup(gl_player3Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_player3Panel.createSequentialGroup()
							.addGap(55)
							.addComponent(player3Label))
						.addGroup(gl_player3Panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_player3Panel.createParallelGroup(Alignment.LEADING)
								.addComponent(player3Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(player3Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(gl_player3Panel.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(player3Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
				.addGroup(Alignment.LEADING, gl_player3Panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(player3Score, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_player3Panel.setVerticalGroup(
			gl_player3Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player3Panel.createSequentialGroup()
					.addGap(41)
					.addComponent(player3Label)
					.addGap(35)
					.addComponent(player3Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(player3Roll)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player3Score)
					.addGap(2)
					.addComponent(player3Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
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
							.addGap(28)
							.addComponent(player2Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_player2Panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_player2Panel.createParallelGroup(Alignment.LEADING)
								.addComponent(player2Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(player2Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_player2Panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(player2Score, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_player2Panel.setVerticalGroup(
			gl_player2Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player2Panel.createSequentialGroup()
					.addGap(40)
					.addComponent(player2Label)
					.addGap(38)
					.addComponent(player2Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(player2Roll)
					.addGap(4)
					.addComponent(player2Score)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player2Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		player2Panel.setLayout(gl_player2Panel);
		
		GroupLayout gl_player1Panel = new GroupLayout(player1Panel);
		gl_player1Panel.setHorizontalGroup(
			gl_player1Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player1Panel.createSequentialGroup()
					.addGroup(gl_player1Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_player1Panel.createSequentialGroup()
							.addGap(46)
							.addComponent(player1Label))
						.addGroup(gl_player1Panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_player1Panel.createParallelGroup(Alignment.LEADING)
								.addComponent(player1Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(player1Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_player1Panel.createSequentialGroup()
							.addGap(30)
							.addComponent(player1Roll))
						.addGroup(Alignment.TRAILING, gl_player1Panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(player1Score, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
					.addGap(20))
		);
		gl_player1Panel.setVerticalGroup(
			gl_player1Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player1Panel.createSequentialGroup()
					.addGap(39)
					.addComponent(player1Label)
					.addGap(32)
					.addComponent(player1Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(player1Roll)
					.addGap(4)
					.addComponent(player1Score)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player1Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(9, Short.MAX_VALUE))
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
		
	    /** ButtonListener - class that implements ActionListener to account for button clicks **/ 
		private class ButtonListener implements ActionListener
			{
				public void actionPerformed (ActionEvent event)
				{
					int x = (int)(Math.random() * 10);
					Object source = event.getSource();
					if(source == player1Roll)
					{
						Player.addRoll(1);
						Player.testAdd(1, x);
						if(Player.returnSumPlayer(1) >= 20 && won == false)
						{
							Player.addGame();
							//System.out.println("I HATE YOU");
							//System.out.println("BITCH PLEASE: " + one);
							player1Score.setText("Iron Man:" + Player.returnSumPlayer(1));
							introLabel.setText("Iron Man WINS!");
							introLabel.setFont(new Font("Serif", Font.BOLD, 80));
							introLabel.setHorizontalAlignment(SwingConstants.CENTER);
							introLabel.setVerticalAlignment(SwingConstants.CENTER);
							won = true;
							Player.addWin(1);
							Player.setRanks(1, 1);
							Player.adjustRanks(1);
						}
						else{
							player1Score.setHorizontalAlignment(SwingConstants.CENTER);
							player1Score.setVerticalAlignment(SwingConstants.CENTER);
							player1Score.setText("Ironman:" + Player.returnSumPlayer(1));
							/*test.setText("Instructions: Roll the die, if the die rolls to be even then the number is\n "
					+ "added on, otherwise if the die shows to be odd nothing is added. The first to 20 pops the balloon and wins!");
							test.setFont(new Font("Serif", Font.BOLD, 30));
							test.setHorizontalAlignment(SwingConstants.CENTER);
							test.setVerticalAlignment(SwingConstants.CENTER);*/}
					}
					else if(source == player2Roll)
					{
						Player.addRoll(2);
						Player.testAdd(2, x);
						if(Player.returnSumPlayer(2) >= 20 && won == false)
						{
							Player.addGame();
							player2Score.setText("Captain America:" + Player.returnSumPlayer(2));
							introLabel.setText("Captain America WINS!");
							introLabel.setFont(new Font("Serif", Font.BOLD, 80));
							introLabel.setHorizontalAlignment(SwingConstants.CENTER);
							introLabel.setVerticalAlignment(SwingConstants.CENTER);
							won = true;
							Player.addWin(2);
							Player.setRanks(2, 1);
							Player.adjustRanks(2);
						}	
						else{
							player2Score.setText("Captain America:" + Player.returnSumPlayer(2));
							/*test.setText("Instructions: Roll the die, if the die rolls to be even then the number is\n "
									+ "added on, otherwise if the die shows to be odd nothing is added. The first to 20 pops the balloon and wins!");
							test.setFont(new Font("Serif", Font.BOLD, 30));
							test.setHorizontalAlignment(SwingConstants.CENTER);
							test.setVerticalAlignment(SwingConstants.CENTER);*/}
					}
					else if(source == player3Roll)
					{
						Player.addRoll(3);
						Player.testAdd(3, x);
						if(Player.returnSumPlayer(3) >= 20 && won == false)
						{
							Player.addGame();
							player3Score.setText("Black Widow:" + Player.returnSumPlayer(3));
							introLabel.setText("BlackWidow Wins!!");
							introLabel.setFont(new Font("Serif", Font.BOLD, 80));
							introLabel.setHorizontalAlignment(SwingConstants.CENTER);
							introLabel.setVerticalAlignment(SwingConstants.CENTER);
							won = true;
							Player.addWin(3);
							Player.setRanks(3, 1);
							Player.adjustRanks(3);
						}
						else{
							player3Score.setText("Black Widow:"  + Player.returnSumPlayer(3));
							/*test.setText("Instructions: Roll the die, if the die rolls to be even then the number is\n "
									+ "added on, otherwise if the die shows to be odd nothing is added. The first to 20 pops the balloon and wins!");
							test.setFont(new Font("Serif", Font.BOLD, 30));
							test.setHorizontalAlignment(SwingConstants.CENTER);
							test.setVerticalAlignment(SwingConstants.CENTER);*/}
					}
					else if(source == player4Roll)
					{
						Player.addRoll(4);
						Player.testAdd(4, x);
						if(Player.returnSumPlayer(4) >= 20 && won == false)
						{
							Player.addGame();
							player4Score.setText("Spiderman:" + Player.returnSumPlayer(4));
							introLabel.setText("SpiderMan Wins!");
							introLabel.setFont(new Font("Serif", Font.BOLD, 80));
							introLabel.setHorizontalAlignment(SwingConstants.CENTER);
							introLabel.setVerticalAlignment(SwingConstants.CENTER);
							won = true;
							Player.addWin(4);
							Player.setRanks(4, 1);
							Player.adjustRanks(4);
						}
						else{
							player4Score.setText("Spiderman:" + Player.returnSumPlayer(4));
							/*test.setText("Instructions: Roll the die, if the die rolls to be even then the number is\n "
									+ "added on, otherwise if the die shows to be odd nothing is added. The first to 20 pops the balloon and wins!");
							test.setFont(new Font("Serif", Font.BOLD, 30));
							test.setHorizontalAlignment(SwingConstants.CENTER);
							test.setVerticalAlignment(SwingConstants.CENTER);*/}
					}
					else if(source == resetButton)
					{
						player1Score.setText(" " + Player.returnResetSum(1));
						player2Score.setText(" " + Player.returnResetSum(2));
						player3Score.setText(" " + Player.returnResetSum(3));
						player4Score.setText(" " + Player.returnResetSum(4));
						won = false;
						introLabel.setText("Instructions: Roll the die, if the die rolls to be even then the number is\n "
									+ "added on, otherwise if the die shows to be odd nothing is added. The first to 20 pops the balloon and wins!");
						introLabel.setFont(new Font("Serfi", Font.BOLD,10));
						introLabel.setHorizontalAlignment(SwingConstants.CENTER);
						introLabel.setVerticalAlignment(SwingConstants.CENTER);
					}
					
					updateUI();
				}
			}

	}
