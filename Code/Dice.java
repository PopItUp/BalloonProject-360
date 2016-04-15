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
				System.out.println("The balloon is popped");
				past = true;
			}
		}
	}
	
	public int returnSum()
	{
		return sum;
	}
	
}
