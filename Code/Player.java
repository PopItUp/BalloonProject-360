public class Player 
{
	static Dice Pl1 = new Dice();
	static Dice Pl2 = new Dice();
	static Dice Pl3= new Dice();
	static Dice Pl4= new Dice();
	
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

}
