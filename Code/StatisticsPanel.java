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
	private JPanel wholePanel, winPanel;
	private JButton victory;
	private JLabel win, test;

	/** StatisticsPanel - constructor that initializes and sets all the instance variables **/ 
	public StatisticsPanel()
	{
		wholePanel = new JPanel();
		winPanel = new JPanel();
		
		test = new JLabel("You have reached the statistics panel!");
		win = new JLabel("YOU WIN! Click to Restart.");
		win.setFont(new Font("Serif", Font.BOLD, 80));
		
		victory = new JButton("Press this to win");
		
		wholePanel.setLayout(new GridLayout(2,2));
		wholePanel.add(test);
		wholePanel.add(victory);
		
		winPanel.setLayout(new BorderLayout());	
		winPanel.add(win, BorderLayout.NORTH);
		winPanel.setVisible(false);

		setLayout(new GridLayout(1,1));
		add(wholePanel);

		ButtonListener listener = new ButtonListener();
		victory.addActionListener(listener);
	}

	/** ButtonListener - class that implements ActionListener to account for button clicks **/ 
	private class ButtonListener implements ActionListener
		{
			public void actionPerformed (ActionEvent event)
			{
				Object source = event.getSource();
				if(source == victory){
					winPanel.setVisible(true);
					
					add(winPanel);
				}
				
				updateUI();
			}
		}



}