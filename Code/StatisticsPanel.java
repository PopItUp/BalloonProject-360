// CSE 360 Project
// Name: PopItUp
// Description: GamePanel is a panel created to feature a 
//				the PopItUp game
//package cse360BalloonGame;
import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** CSE 360 Project - Statistics Panel class
 * @author PopItUp
 * Description: GamePanel is a panel created to feature a 
 * 			the PopItUp game
 */
public class StatisticsPanel extends JPanel
{
	private JPanel wholePanel, rankPanel;
	private JButton victory;
	private JLabel test, p1, p2, p3, p4, p1rank, p2rank, p3rank, p4rank, p1rolls, p2rolls, p3rolls, p4rolls, rollsAre, ranksAre, blank;

	/** StatisticsPanel - constructor that initializes and sets all the instance variables **/ 
	public StatisticsPanel()
	{
		wholePanel = new JPanel();
		rankPanel = new JPanel();
		blank = new JLabel("");
		test = new JLabel("You have reached the statistics panel!");
		p1 = new JLabel("PLayer 1: ");
		p2 = new JLabel("PLayer 2: ");
		p3 = new JLabel("PLayer 3: ");
		p4 = new JLabel("PLayer 4: ");
		
		rollsAre = new JLabel("Rolls:");
		ranksAre = new JLabel("Rank:");

		p1rolls = new JLabel("" + Player.getRolls(1));
		p2rolls = new JLabel("" + Player.getRolls(2));
		p3rolls = new JLabel("" + Player.getRolls(3));
		p4rolls = new JLabel("" + Player.getRolls(4));
		
		p1rank = new JLabel("" + Player.getRanks(1));
		p2rank = new JLabel("" + Player.getRanks(2));
		p3rank = new JLabel("" + Player.getRanks(3));
		p4rank = new JLabel("" + Player.getRanks(4));

				
		wholePanel.setLayout(new GridLayout(2,2));
		wholePanel.add(test);
		
		rankPanel.setLayout(new GridLayout(5,3));
		rankPanel.add(blank);
		rankPanel.add(ranksAre);
		rankPanel.add(rollsAre);
		
		rankPanel.add(p1);
		rankPanel.add(p1rank);
		rankPanel.add(p1rolls);

		rankPanel.add(p2);
		rankPanel.add(p2rank);
		rankPanel.add(p2rolls);

		rankPanel.add(p3);
		rankPanel.add(p3rank);
		rankPanel.add(p3rolls);

		rankPanel.add(p4);
		rankPanel.add(p4rank);
		rankPanel.add(p4rolls);
		
		//setLayout(new GridLayout(1,1));
		add(wholePanel);
		wholePanel.add(rankPanel);
	}
}
