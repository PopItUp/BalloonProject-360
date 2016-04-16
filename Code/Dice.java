/** CSE 360 Project - Dice class
 * @author PopItUp
 * Description: The Dice class accounts for the rolls that each player 
 * receives through the add and returnSum methods
 */
public class Dice 
{
	public boolean past = false;
	private int rank = 0;
	private int pops = 0;
	private int rolls = 0;
	private int sum = 0;
	private int sum = 0;
	/**add - The dice is rolled and random values are pushed in but only the even numbers will make the balloon pop.
	 * The odd numbers of the dice will not do anything
	 * Also the sum is thing which saves the added values
	 * If the sum is lesser than 20 (which is the max limit to reach by any player) then the balloon dosen't pop
	 * 
	 * @param in, random values that could potentially be added to the score
	 **/
	public void add(int in)
	{
		if(in % 2==0)
		{
			sum += in;
			if(sum >= 20)
			{
				System.out.print("The balloon is popped");
				past = true;
			}
			else
			{
				System.out.print("The balloon is not popped");
			}
		}
		else if(sum < 20)
		{
				System.out.print("The balloon is not popped");
		}
	}
	/** return- returns the calculated total that represents the players current score 
	 * 
	 * @return int, returns the modified private instance variable of sum.
	 **/
	public int returnSum()
	{
		return sum;
	}
	
	public int getPops()
	{
		return pops;
	}
	
	public int getRolls()
	{
		return rolls;
	}
	
	public int getRanks()
	{
		return rank;
	}
	
	public void setRank(int place)
	{
		rank = place;
	}
	
	public void incPops()
	{
		pops += 1;
	}
	
	public void incRolls()
	{
		rolls += 1;
	}
}
