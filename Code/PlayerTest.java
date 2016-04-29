import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class PlayerTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	@Test
	public void testPlayer() {
		Player player = new Player();
		
		assertNotNull(player);
	}
	
	@Test
	public void testPoppedPlayer1() {
		Player player = new Player();
		
		Player.testAdd(1, 20);
		
		assertEquals("The balloon is popped", outContent.toString());
	}
	
	@Test
	public void testPoppedPlayer2() {

		Player.testAdd(2, 20);
		
		assertEquals("The balloon is popped", outContent.toString());
	}
	
	@Test
	public void testPoppedPlayer3() {
		
		Player.testAdd(3, 20);
		
		assertEquals("The balloon is popped", outContent.toString());
	}
	
	@Test
	public void testPoppedPlayer4() {
		
		Player.testAdd(4, 20);
		
		assertEquals("The balloon is popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedOddPlayer1() {
		
		Player.testAdd(1, 5);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedOddPlayer2() {
		
		Player.testAdd(2, 5);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedOddPlayer3() {
		
		Player.testAdd(3, 5);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedOddPlayer4() {
		
		Player.testAdd(4, 5);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedEvenPlayer1() {
		
		Player.testAdd(1, 6);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedEvenPlayer2() {
		
		Player.testAdd(2, 6);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedEvenPlayer3() {
		
		Player.testAdd(3, 6);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedEvenPlayer4() {
		
		Player.testAdd(4, 6);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testRollsPlayer1() {
		
		Player.addRoll(1);
		
		assertEquals(1, Player.getRolls(1));
	}
	
	@Test
	public void testRollsPlayer2() {
		
		Player.addRoll(2);
		Player.addRoll(2);
		
		assertEquals(2, Player.getRolls(2));
	}
	
	@Test
	public void testRollsPlayer3() {
	
		Player.addRoll(3);
		Player.addRoll(3);
		Player.addRoll(3);
		
		assertEquals(3, Player.getRolls(3));
	}
	
	@Test
	public void testRollsPlayer4() {
		
		Player.addRoll(4);
		Player.addRoll(4);
		Player.addRoll(4);
		Player.addRoll(4);
		
		assertEquals(4, Player.getRolls(4));
	}
	
	@Test
	public void testRankPlayer1() {
	
		Player.setRanks(1, 2);
		
		assertEquals(2, Player.getRanks(1));
	}
	
	@Test
	public void testRankPlayer2() {
		
		Player.setRanks(2, 4);
		
		assertEquals(4, Player.getRanks(2));
	}
	
	@Test
	public void testRankPlayer3() {
	
		Player.setRanks(3, 1);
		
		assertEquals(1, Player.getRanks(3));
	}
	
	@Test
	public void testRankPlayer4() {
		
		Player.setRanks(4, 4);
		
		assertEquals(4, Player.getRanks(4));
	}
	
	@Test
	public void testAdjustRankings() {
		
		Player.testAdd(2, 7);
		Player.testAdd(3, 12);
		Player.testAdd(4, 3);
		
		Player.adjustRanks(1);
		
		assertEquals(4, Player.getRanks(4));
		assertEquals(3, Player.getRanks(3));
		assertEquals(2, Player.getRanks(2));
	}
	
	@Test
	public void testResetSumPlayer1(){
		
		Player.testAdd(1, 15);
		
		assertEquals(0, Player.returnResetSum(1));
		
	}
	
	@Test
	public void testResetSumPlayer2(){
		
		Player.testAdd(2, 15);
		
		assertEquals(0, Player.returnResetSum(2));
		
	}
	
	@Test
	public void testResetSumPlayer3(){
		
		Player.testAdd(3, 15);
		
		assertEquals(0, Player.returnResetSum(3));
		
	}
	
	@Test
	public void testResetSumPlayer4(){
		
		Player.testAdd(4, 15);
		
		assertEquals(0, Player.returnResetSum(4));
		
	}
	
	@Test
	public void calcAvgPlayer1(){
		
		Player.testAdd(1, 10);
		
		assertEquals(1, Player.calcAvg(1), .1);
		
	}
	
	@Test
	public void calcAvgPlayer2(){
		
		Player.testAdd(2, 10);
		
		assertEquals(2, Player.calcAvg(2), .1);
		
	}
	
	@Test
	public void calcAvgPlayer3(){
		
		Player.testAdd(3, 10);
		
		assertEquals(3, Player.calcAvg(3), .1);
		
	}
	
	@Test
	public void calcAvgPlayer4(){
		
		Player.testAdd(4, 10);
		
		assertEquals(4, Player.calcAvg(4), .1);
		
	}
	
}
