// CSE 360 Project
// Name: PopItUp
// Description: GamePanel is a panel created to feature a 
//				the PopItUp game
//package cse360BalloonGame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{
	private JPanel wholePanel, winPanel, rollPanel, rollEntirePanel;
	private JButton victory, rollDicePlayer1, rollDicePlayer2, rollDicePlayer3, rollDicePlayer4;
	private JLabel win, test, player1, player2, player3, player4, test2;
	private int count1, count2, count3, count4;
	private Dice Pl1, Pl2, Pl3, Pl4;
	private boolean won = false;
	
	public GamePanel()
	{

		wholePanel = new JPanel();
		winPanel = new JPanel();
		rollPanel = new JPanel();
		rollEntirePanel = new JPanel();
		test = new JLabel("You have reached the game panel!");
		test2 = new JLabel(" ");
		win = new JLabel("YOU WIN! Click to Restart.");
		win.setFont(new Font("Serif", Font.BOLD, 80));
		
		rollDicePlayer1 = new JButton("Roll for Player 1");
		rollDicePlayer2 = new JButton("Roll for Player 2");
		rollDicePlayer3 = new JButton("Roll for Player 3");
		rollDicePlayer4 = new JButton("Roll for Player 4");
		
		player1 = new JLabel("Player1");
		player2 = new JLabel("Player2");
		player3 = new JLabel("Player3");
		player4 = new JLabel("Player4");
		
		wholePanel.setLayout(new GridLayout(2,2));
		wholePanel.add(test);
		
		rollEntirePanel.setLayout(new FlowLayout());
		rollEntirePanel.add(test2);
		rollEntirePanel.add(rollPanel);
		
		rollPanel.setLayout(new GridLayout(4,2));
		rollPanel.add(rollDicePlayer1);
		rollPanel.add(rollDicePlayer2);
		rollPanel.add(player1);
		rollPanel.add(player2);
		rollPanel.add(rollDicePlayer3);
		rollPanel.add(rollDicePlayer4);
		rollPanel.add(player3);
		rollPanel.add(player4);
		
		winPanel.setLayout(new BorderLayout());	
		winPanel.add(win, BorderLayout.NORTH);
		winPanel.setVisible(false);
		
		setLayout(new GridLayout(1,1));
		add(wholePanel);
		wholePanel.add(rollPanel);
		add(winPanel);

		ButtonListener listener = new ButtonListener();
		rollDicePlayer1.addActionListener(listener);
		rollDicePlayer2.addActionListener(listener);
		rollDicePlayer3.addActionListener(listener);
		rollDicePlayer4.addActionListener(listener);
	}

	//make sure the numbers pop up properly
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
						winPanel.setVisible(true);
						won = true;
					}
					else
						player1.setText("Player 1:" + Player.returnSumPlayer(1));
				}
				else if(source == rollDicePlayer2)
				{
					Player.testAdd(2, x);
					if(Player.returnSumPlayer(2) >= 20 && won == false)
					{
						player2.setText("Player 2:" + Player.returnSumPlayer(2));
						winPanel.setVisible(true);
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
						winPanel.setVisible(true);
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
						winPanel.setVisible(true);
						won = true;
					}
					else
						player4.setText("Player 4:" + Player.returnSumPlayer(4));
				}
				
				updateUI();
			}
		}



}