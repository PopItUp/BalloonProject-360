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

public class StartPanel extends JPanel {
	private JTextField userTextField, passTextField;
	private JLabel titleLabel, balloonGif, startLabel, userLabel, passLabel; 
	private JButton loginButton; 

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
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(115, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(58)
									.addComponent(startLabel))
								.addComponent(balloonGif, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))
							.addGap(171))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(userLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(passLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(passTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(62)
							.addComponent(loginButton)
							.addGap(46))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(229)
					.addComponent(titleLabel)
					.addContainerGap(250, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(loginButton)
							.addComponent(passTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(userLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addComponent(passLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(titleLabel)
					.addGap(10)
					.addComponent(balloonGif, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(startLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
