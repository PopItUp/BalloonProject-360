package me;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GamePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public GamePanel() {
		setBackground(new Color(51, 153, 204));
		
		JPanel player1Panel = new JPanel();
		player1Panel.setBackground(new Color(255, 102, 102));
		
		JPanel player2Panel = new JPanel();
		player2Panel.setBackground(new Color(255, 204, 102));
		
		JPanel player3Panel = new JPanel();
		player3Panel.setBackground(new Color(255, 102, 102));
		
		JPanel Player4Panel = new JPanel();
		Player4Panel.setBackground(new Color(255, 204, 102));
		
		JButton logoutButton = new JButton("Logout");
		
		JLabel IntroLabel = new JLabel("New label");
		
		JButton resetButton = new JButton("Reset");
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
							.addComponent(Player4Panel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(resetButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(IntroLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
							.addComponent(IntroLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(Player4Panel, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
						.addComponent(player3Panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(player2Panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(player1Panel, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JLabel player4Label = new JLabel("Player 4");
		
		JLabel Player4Balloon = new JLabel("Picture Here");
		
		JLabel player4Dice = new JLabel("Picture Here");
		
		JButton player4Roll = new JButton("Roll Dice");
		GroupLayout gl_Player4Panel = new GroupLayout(Player4Panel);
		gl_Player4Panel.setHorizontalGroup(
			gl_Player4Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Player4Panel.createSequentialGroup()
					.addContainerGap(57, Short.MAX_VALUE)
					.addComponent(player4Label)
					.addGap(54))
				.addGroup(gl_Player4Panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_Player4Panel.createParallelGroup(Alignment.LEADING)
						.addComponent(player4Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(Player4Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_Player4Panel.createSequentialGroup()
					.addGap(28)
					.addComponent(player4Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_Player4Panel.setVerticalGroup(
			gl_Player4Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Player4Panel.createSequentialGroup()
					.addGap(38)
					.addComponent(player4Label)
					.addGap(29)
					.addComponent(Player4Balloon, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(player4Roll)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(player4Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		Player4Panel.setLayout(gl_Player4Panel);
		
		JLabel player3Label = new JLabel("Player 3");
		
		JLabel player3Balloon = new JLabel("Picture Here");
		
		JLabel player3Dice = new JLabel("Picture Here");
		
		JButton player3Roll = new JButton("Roll Dice");
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
								.addComponent(player3Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(player3Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_player3Panel.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(player3Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
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
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(player3Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		player3Panel.setLayout(gl_player3Panel);
		
		JLabel player2Label = new JLabel("Player 2");
		
		JLabel player2Balloon = new JLabel("Picture Here");
		
		JLabel player2Dice = new JLabel("Picture Here");
		
		JButton player2Roll = new JButton("Roll Dice");
		GroupLayout gl_player2Panel = new GroupLayout(player2Panel);
		gl_player2Panel.setHorizontalGroup(
			gl_player2Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_player2Panel.createSequentialGroup()
					.addGroup(gl_player2Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_player2Panel.createSequentialGroup()
							.addGap(50)
							.addComponent(player2Label, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_player2Panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_player2Panel.createParallelGroup(Alignment.LEADING)
								.addComponent(player2Dice, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(player2Balloon, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_player2Panel.createSequentialGroup()
							.addGap(28)
							.addComponent(player2Roll, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
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
					.addGap(18)
					.addComponent(player2Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(14))
		);
		player2Panel.setLayout(gl_player2Panel);
		
		JLabel player1Label = new JLabel("Player 1");
		
		JLabel player1Balloon = new JLabel("Picture Here");
		
		JButton player1Roll = new JButton("Roll Dice");
		player1Roll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel player1Dice = new JLabel("Picture Here");
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
							.addComponent(player1Roll)))
					.addContainerGap(20, Short.MAX_VALUE))
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
					.addGap(26)
					.addComponent(player1Dice, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(9, Short.MAX_VALUE))
		);
		player1Panel.setLayout(gl_player1Panel);
		setLayout(groupLayout);

	}
}
