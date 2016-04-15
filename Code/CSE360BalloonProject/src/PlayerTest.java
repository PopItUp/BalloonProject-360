//package cse360BalloonGame;

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
		
		player.testAdd(1, 20);
		
		assertEquals("The balloon is popped", outContent.toString());
	}
	
	@Test
	public void testPoppedPlayer2() {
		Player player = new Player();
		
		player.testAdd(2, 20);
		
		assertEquals("The balloon is popped", outContent.toString());
	}
	
	@Test
	public void testPoppedPlayer3() {
		Player player = new Player();
		
		player.testAdd(3, 20);
		
		assertEquals("The balloon is popped", outContent.toString());
	}
	
	@Test
	public void testPoppedPlayer4() {
		Player player = new Player();
		
		player.testAdd(4, 20);
		
		assertEquals("The balloon is popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedOddPlayer1() {
		Player player = new Player();
		
		player.testAdd(1, 5);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedOddPlayer2() {
		Player player = new Player();
		
		player.testAdd(2, 5);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedOddPlayer3() {
		Player player = new Player();
		
		player.testAdd(3, 5);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedOddPlayer4() {
		Player player = new Player();
		
		player.testAdd(4, 5);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedEvenPlayer1() {
		Player player = new Player();
		
		player.testAdd(1, 6);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedEvenPlayer2() {
		Player player = new Player();
		
		player.testAdd(2, 6);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedEvenPlayer3() {
		Player player = new Player();
		
		player.testAdd(3, 6);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
	
	@Test
	public void testNotPoppedEvenPlayer4() {
		Player player = new Player();
		
		player.testAdd(4, 6);
		
		assertEquals("The balloon is not popped", outContent.toString());
	}
}