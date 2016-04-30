// CSE 360 Project
// Name: PopItUp
// Description: GamePanel is a panel created to feature a 
//				the PopItUp game
//package cse360BalloonGame;
package me;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StatisticsPanel extends JPanel {
	
	/**
	 * Create the panel.
	 */
	private JButton logoutButton, refreshButton; 
	private JLabel statsLabel, rollLabel, rankingLabel, averageLabel; 
	private JLabel player1Label, player2Label, player3Label, player4Label;
	private JLabel player1Rolls, player2Rolls, player3Rolls, player4Rolls;
	private JLabel player1Ranking, player2Ranking, player3Ranking, player4Ranking;
	private JLabel player1Avg, player2Avg, player3Avg, player4Avg;
	
	public StatisticsPanel() {
		setBackground(new Color(51, 153, 255));
		
		logoutButton = new JButton("Logout");
		refreshButton = new JButton("Refresh Statistics\n");
		
		statsLabel = new JLabel("Statistics");
		statsLabel.setForeground(new Color(255, 255, 255));
		statsLabel.setFont(new Font("Marker Felt", Font.BOLD, 32));
		
		rollLabel = new JLabel("Rolls\n\n");
		rollLabel.setForeground(new Color(255, 255, 255));
		rollLabel.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		averageLabel = new JLabel("Average Rolls Per Game\n");
		averageLabel.setForeground(Color.WHITE);
		averageLabel.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		rankingLabel = new JLabel("Ranking\n");
		rankingLabel.setForeground(new Color(255, 255, 255));
		rankingLabel.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player1Label = new JLabel("Player 1\n");
		player1Label.setForeground(new Color(255, 255, 255));
		player1Label.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player2Label = new JLabel("Player 2\n");
		player2Label.setForeground(new Color(255, 255, 255));
		player2Label.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player3Label = new JLabel("Player 3\n");
		player3Label.setForeground(new Color(255, 255, 255));
		player3Label.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player4Label = new JLabel("Player 4\n");
		player4Label.setForeground(new Color(255, 255, 255));
		player4Label.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player1Rolls = new JLabel("0\n\n");
		player1Rolls.setForeground(new Color(255, 255, 255));
		player1Rolls.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player2Rolls = new JLabel("0\n");
		player2Rolls.setForeground(new Color(255, 255, 255));
		player2Rolls.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player3Rolls = new JLabel("0\n");
		player3Rolls.setForeground(new Color(255, 255, 255));
		player3Rolls.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player4Rolls = new JLabel("0\n");
		player4Rolls.setForeground(new Color(255, 255, 255));
		player4Rolls.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player1Ranking = new JLabel("0\n");
		player1Ranking.setForeground(new Color(255, 255, 255));
		player1Ranking.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player2Ranking = new JLabel("0\n");
		player2Ranking.setForeground(new Color(255, 255, 255));
		player2Ranking.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player3Ranking = new JLabel("0\n");
		player3Ranking.setForeground(new Color(255, 255, 255));
		player3Ranking.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player4Ranking = new JLabel("0\n");
		player4Ranking.setForeground(new Color(255, 255, 255));
		player4Ranking.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player1Avg = new JLabel("0\n");
		player1Avg.setForeground(Color.WHITE);
		player1Avg.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player2Avg = new JLabel("0\n");
		player2Avg.setForeground(Color.WHITE);
		player2Avg.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player3Avg = new JLabel("0\n");
		player3Avg.setForeground(Color.WHITE);
		player3Avg.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		player4Avg = new JLabel("0\n");
		player4Avg.setForeground(Color.WHITE);
		player4Avg.setFont(new Font("Marker Felt", Font.BOLD, 16));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(279)
					.addComponent(statsLabel, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addGap(205)
					.addComponent(logoutButton)
					.addGap(21))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(115)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(77)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(player2Rolls, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(player3Rolls, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(player4Rolls, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(rollLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
										.addComponent(player1Rolls, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(42)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(player2Ranking)
												.addComponent(player1Ranking)
												.addComponent(player3Ranking)
												.addComponent(player4Ranking)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(24)
											.addComponent(rankingLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
									.addGap(88)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(averageLabel, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(6)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(player1Avg, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
												.addComponent(player2Avg, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
												.addComponent(player3Avg, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
												.addComponent(player4Avg, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(player4Label, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(player3Label, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(player2Label, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(player1Label))
							.addPreferredGap(ComponentPlacement.RELATED, 439, GroupLayout.PREFERRED_SIZE)))
					.addGap(117))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(251)
					.addComponent(refreshButton)
					.addContainerGap(317, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(logoutButton)
							.addGap(66))
						.addComponent(statsLabel, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(rankingLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(rollLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(averageLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(player1Label, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(player2Label, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(player3Label, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(player4Label, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(player1Rolls, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addComponent(player1Ranking, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
								.addComponent(player1Avg, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(player2Rolls, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(player3Rolls, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(player2Avg, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addComponent(player2Ranking, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(player3Avg, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addComponent(player3Ranking, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(player4Ranking, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(player4Avg, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(player4Rolls, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))))
					.addGap(52)
					.addComponent(refreshButton)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}

