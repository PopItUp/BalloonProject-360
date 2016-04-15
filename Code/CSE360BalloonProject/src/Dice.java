//package cse360BalloonGame;
public class Dice 
{
	public boolean past = false;
	private int sum = 0;
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
	
	public int returnSum()
	{
		return sum;
	}
	
}
