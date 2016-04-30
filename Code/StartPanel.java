import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

/** CSE 360 Project - StartPanel class
 * @author PopItUp
 * Description: StartPanel extends JPanel and is where the first screen is showed. It
 * 			allows the user to enter in a name and then go start or to the
 * 			statistics panel.
 * 
 */
public class StartPanel extends JPanel {
	int count = 0;
	ArrayList<String> players = new ArrayList<String>();
	private String playerText;
	private JTextField userTextField, passTextField;
	private JLabel titleLabel, balloonGif, startLabel, userLabel, passLabel, hiLabel; 
	private JButton loginButton; 
	/**
	 * Create the panel.
	 */
	public StartPanel() {
		setBackground(new Color(51, 153, 255));
		
		titleLabel = new JLabel("Pop It Up!");
		titleLabel.setForeground(new Color(255, 255, 255));
		titleLabel.setFont(new Font("Marker Felt", Font.PLAIN, 62));
		
		balloonGif = new JLabel(new ImageIcon("balloons.gif"));
		
		startLabel = new JLabel("Press Start to Begin! ");
		startLabel.setForeground(Color.WHITE);
		startLabel.setFont(new Font("Marker Felt", Font.PLAIN, 23));
		
		userTextField = new JTextField();
		userTextField.setColumns(10);
		
		passTextField = new JTextField();
		passTextField.setColumns(10);
		
		loginButton = new JButton("Login");
		
		userLabel = new JLabel("Enter your name:\n");
		userLabel.setForeground(Color.WHITE);
		userLabel.setFont(new Font("Marker Felt", Font.PLAIN, 13));
		
		passLabel = new JLabel("Pass:");
		passLabel.setForeground(Color.WHITE);
		passLabel.setFont(new Font("Marker Felt", Font.PLAIN, 13));
		
		hiLabel = new JLabel(" ");
		hiLabel.setForeground(Color.WHITE);
		hiLabel.setFont(new Font("Marker Felt", Font.PLAIN, 13));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(237)
							.addComponent(startLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(26, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(hiLabel, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
									.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(userLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addGap(16)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
									.addGap(44)
									.addComponent(loginButton))
								.addComponent(titleLabel))
							.addGap(77)))
					.addContainerGap(29, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(156)
					.addComponent(balloonGif, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(199, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(23, Short.MAX_VALUE)
							.addComponent(titleLabel)
							.addGap(36))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(89)
							.addComponent(hiLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(userLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(loginButton))
					.addGap(54)
					.addComponent(balloonGif, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(startLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		setLayout(groupLayout);

		
		ButtonListener listener = new ButtonListener();
		loginButton.addActionListener(listener);
		userTextField.addActionListener(listener);
		passTextField.addActionListener(listener);

	}
	/** ButtonListener will keep track of the name that is inputted.
	 * @author PopItUp
	 * @param event - The event in which a name is entered into the textfield.
	 */
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{	
			count++;
			playerText += ",";
			playerText += userTextField.getText();
			playerText += "," + passTextField.getText();
			//System.out.println(playerText);
			
			//players.add(playerText);
			
			Object source = event.getSource();
			if(source == loginButton)
			{
				String[] names = playerText.split(",");
				hiLabel.setText("Hi, " + names[1]);
			
			}
		}
	}
}
