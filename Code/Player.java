/** CSE 360 Project - Player class
 * @author PopItUp
 * Description: The Player class allows the editing of the ranks and rolls
 * of the different players in the game.
 */
public class Player 
{
	static Dice Pl1 = new Dice();
	static Dice Pl2 = new Dice();
	static Dice Pl3= new Dice();
	static Dice Pl4= new Dice();
	
	/**testAdd - This method allows the player to have points incremented to their score. It takes in two 
	 * parameters and tests which player is supposed to have points added to their score.
	 * 
	 * @param play, the player that the points are corresponding to
	 * @param total, the points that need to be added to a player's total score
	 **/
	public static void testAdd(int play, int total)
	{
		if(play == 1)
			Pl1.add(total);
		else if(play == 2)
			Pl2.add(total);
		else if(play == 3)
			Pl3.add(total);
		else if(play == 4)
			Pl4.add(total);
	}
	
	/**returnSumPlayer - This method returns the sum of the points that a certain player has.
	 * 
	 * @param play, the player that the points are corresponding to
	 * @return int, returns the total points that a certain player has
	 **/
	public static int returnSumPlayer(int play)
	{
		int value = 0;
		if(play == 1)
			value = Pl1.returnSum();
		else if(play == 2)
			value = Pl2.returnSum();
		else if(play == 3)
			value = Pl3.returnSum();
		else if(play == 4)
			value = Pl4.returnSum();
		
		return value;
	}
	
	public static void addWin(int play)
	{
		if(play == 1)
			Pl1.incPops();
		else if(play == 2)
			Pl2.incPops();
		else if(play == 3)
			Pl3.incPops();
		else if(play == 4)
			Pl4.incPops();
	}
	
	public static void addRoll(int play)
	{
		if(play == 1)
			Pl1.incRolls();
		else if(play == 2)
			Pl2.incRolls();
		else if(play == 3)
			Pl3.incRolls();
		else if(play == 4)
			Pl4.incRolls();
	}
	
	public static int getRolls(int play)
	{
		if(play == 1)
			return Pl1.getRolls();
		else if(play == 2)
			return Pl2.getRolls();
		else if(play == 3)
			return Pl3.getRolls();
		else if(play == 4)
			return Pl4.getRolls();
		return -1;
	}
	
	public static int getRanks(int play)
	{
		if(play == 1)
			return Pl1.getRanks();
		else if(play == 2)
			return Pl2.getRanks();
		else if(play == 3)
			return Pl3.getRanks();
		else if(play == 4)
			return Pl4.getRanks();
		return -1;
	}
	
	public static void setRanks(int play, int place)
	{
		if(play == 1)
			Pl1.setRank(place);
		else if(play == 2)
			Pl2.setRank(place);
		else if(play == 3)
			Pl3.setRank(place);
		else if(play == 4)
			Pl4.setRank(place);
	}
	
	/**adjustRanks - This method ranks the player corresponding to their point totals.
	 * 
	 * @param first, this parameter is the player who won first in the game
	 **/
	public static void adjustRanks(int first)
	{
		if (first == 1)
		{
			if (Pl2.returnSum() > Pl3.returnSum())
			{
				if (Pl3.returnSum() > Pl4.returnSum())
				{
					Pl2.setRank(2);
					Pl3.setRank(3);
					Pl4.setRank(4);
				}
				
				else if (Pl2.returnSum() > Pl4.returnSum())
				{
					Pl2.setRank(2);
					Pl3.setRank(4);
					Pl4.setRank(3);
				}
				
				else
				{
					Pl2.setRank(3);
					Pl3.setRank(4);
					Pl4.setRank(2);
				}
			}
			
			else if (Pl3.returnSum() > Pl2.returnSum())
			{
				if (Pl2.returnSum() > Pl4.returnSum())
				{
					Pl2.setRank(3);
					Pl3.setRank(2);
					Pl4.setRank(4);
				}
				
				else if (Pl4.returnSum() > Pl3.returnSum())
				{
					Pl2.setRank(4);
					Pl3.setRank(3);
					Pl4.setRank(2);
				}
				
				else
				{
					Pl2.setRank(4);
					Pl3.setRank(2);
					Pl4.setRank(3);
				}
			}
		}
		
		else if (first == 2)
		{
			if (Pl1.returnSum() > Pl3.returnSum())
			{
				if (Pl3.returnSum() > Pl4.returnSum())
				{
					Pl1.setRank(2);
					Pl3.setRank(3);
					Pl4.setRank(4);
				}
				
				else if (Pl1.returnSum() > Pl4.returnSum())
				{
					Pl1.setRank(2);
					Pl3.setRank(4);
					Pl4.setRank(3);
				}
				
				else
				{
					Pl1.setRank(3);
					Pl3.setRank(4);
					Pl4.setRank(2);
				}
			}
			
			else if (Pl3.returnSum() > Pl1.returnSum())
			{
				if (Pl1.returnSum() > Pl4.returnSum())
				{
					Pl1.setRank(3);
					Pl3.setRank(2);
					Pl4.setRank(4);
				}
				
				else if (Pl4.returnSum() > Pl3.returnSum())
				{
					Pl1.setRank(4);
					Pl3.setRank(3);
					Pl4.setRank(2);
				}
				
				else
				{
					Pl1.setRank(4);
					Pl3.setRank(2);
					Pl4.setRank(3);
				}
			}
		}
		
		else if (first == 3)
		{
			if (Pl2.returnSum() > Pl1.returnSum())
			{
				if (Pl1.returnSum() > Pl4.returnSum())
				{
					Pl2.setRank(2);
					Pl1.setRank(3);
					Pl4.setRank(4);
				}
				
				else if (Pl2.returnSum() > Pl4.returnSum())
				{
					Pl2.setRank(2);
					Pl1.setRank(4);
					Pl4.setRank(3);
				}
				
				else
				{
					Pl2.setRank(3);
					Pl1.setRank(4);
					Pl4.setRank(2);
				}
			}
			
			else if (Pl1.returnSum() > Pl2.returnSum())
			{
				if (Pl2.returnSum() > Pl4.returnSum())
				{
					Pl2.setRank(3);
					Pl1.setRank(2);
					Pl4.setRank(4);
				}
				
				else if (Pl4.returnSum() > Pl1.returnSum())
				{
					Pl2.setRank(4);
					Pl1.setRank(3);
					Pl4.setRank(2);
				}
				
				else
				{
					Pl2.setRank(4);
					Pl1.setRank(2);
					Pl4.setRank(3);
				}
			}
		}
		
		else if (first == 4)
		{
			if (Pl2.returnSum() > Pl3.returnSum())
			{
				if (Pl3.returnSum() > Pl1.returnSum())
				{
					Pl2.setRank(2);
					Pl3.setRank(3);
					Pl1.setRank(4);
				}
				
				else if (Pl2.returnSum() > Pl1.returnSum())
				{
					Pl2.setRank(2);
					Pl3.setRank(4);
					Pl1.setRank(3);
				}
				
				else
				{
					Pl2.setRank(3);
					Pl3.setRank(4);
					Pl1.setRank(2);
				}
			}
			
			else if (Pl3.returnSum() > Pl2.returnSum())
			{
				if (Pl2.returnSum() > Pl1.returnSum())
				{
					Pl2.setRank(3);
					Pl3.setRank(2);
					Pl1.setRank(4);
				}
				
				else if (Pl1.returnSum() > Pl3.returnSum())
				{
					Pl2.setRank(4);
					Pl3.setRank(3);
					Pl1.setRank(2);
				}
				
				else
				{
					Pl2.setRank(4);
					Pl3.setRank(2);
					Pl1.setRank(3);
				}
			}
		}
	}	
}
