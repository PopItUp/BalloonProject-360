package me;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class StartPanel extends JPanel {
	private JTextField userTextField, passTextField;
	private JLabel titleLabel, balloonGif, startLabel, userLabel, passLabel; 
	private JButton loginButton; 
	private JRadioButton player1Radio, player2Radio, player3Radio, player4Radio;

	/**
	 * Create the panel.
	 */
	public StartPanel() {
		setBackground(new Color(51, 153, 255));
		
		titleLabel = new JLabel("Pop It Up!");
		titleLabel.setForeground(new Color(255, 255, 255));
		titleLabel.setFont(new Font("Marker Felt", Font.PLAIN, 62));
		
		balloonGif = new JLabel("Gif Here\n");
		
		startLabel = new JLabel("Press Start to Begin! ");
		startLabel.setForeground(Color.WHITE);
		startLabel.setFont(new Font("Marker Felt", Font.PLAIN, 23));
		
		userTextField = new JTextField();
		userTextField.setColumns(10);
		
		passTextField = new JTextField();
		passTextField.setColumns(10);
		
		loginButton = new JButton("Login");
		
		userLabel = new JLabel("User:\n");
		userLabel.setForeground(Color.WHITE);
		userLabel.setFont(new Font("Marker Felt", Font.PLAIN, 13));
		
		passLabel = new JLabel("Pass:");
		passLabel.setForeground(Color.WHITE);
		passLabel.setFont(new Font("Marker Felt", Font.PLAIN, 13));
		
		player1Radio = new JRadioButton("Iron Man");
		player3Radio = new JRadioButton("Spider-Man");
		player2Radio = new JRadioButton("Black Widow");
		player4Radio = new JRadioButton("Captain America\n");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(231)
							.addComponent(titleLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(237)
							.addComponent(startLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(156)
							.addComponent(balloonGif, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(137)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(userLabel)
								.addComponent(passLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(15)
									.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(passTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(player1Radio)
									.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(player3Radio)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(player4Radio, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(player2Radio, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(loginButton)))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addComponent(titleLabel)
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(userLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(player1Radio)
						.addComponent(player2Radio))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(player3Radio)
								.addComponent(player4Radio))
							.addGap(8))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(passTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(passLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addGap(32)
					.addComponent(balloonGif, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(startLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(148)
					.addComponent(loginButton)
					.addContainerGap(323, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
