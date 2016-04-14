public class Dice {
	private int sum;
	public int add(int in)
	{
		sum=0;
		while(in%2==0)
		{
			sum+=in;
			if(sum>=20)
			{
				System.out.println("The balloon is popped");
			}
			return sum;
		}
		return in;
	}
	
}
