// CSE 360 Project
// Name: PopItUp
// Description:StartPanel is a panel that features the title of the 
//				program, a GIF, and a direction to prompt the user to
//				proceed to the game

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel
{

	private JPanel wholePanel;
	private JLabel welcomeMessage, startMessage, picture;

	public StartPanel()
	{
		wholePanel  = new JPanel();

		welcomeMessage = new JLabel(" PopItUp!");
		welcomeMessage.setFont(new Font("Serif", Font.BOLD, 80));
		
		picture = new JLabel(new ImageIcon("balloons.gif"));
		
		startMessage = new JLabel("Press Begin to begin: ");
		startMessage.setFont(new Font("Serif", Font.BOLD, 30));
		
		wholePanel.add(welcomeMessage, Box.CENTER_ALIGNMENT);
		setLayout(new GridLayout(3,1));
		add(wholePanel);
		add(picture);
		add(startMessage);
		

	}
	

} //end of StartPanel class

