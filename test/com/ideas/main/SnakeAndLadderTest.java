/**
 * 
 */
package com.ideas.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vk82286
 *
 */
public class SnakeAndLadderTest {
	SnakeAndLadder snakeAndLadder = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		snakeAndLadder = new SnakeAndLadder();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		snakeAndLadder=null;
	}

	/**
	 * Test method for
	 * {@link com.ideas.main.SnakeAndLadder#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {

	}

	/**
	 * Test method for {@link com.ideas.main.SnakeAndLadder#loadGame()}.
	 */
	@Test
	public void testLoadGame() {

		try {
			snakeAndLadder.loadGame();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	/**
	 * Test method for {@link com.ideas.main.SnakeAndLadder#rollDice()}.
	 */
	@Test
	public void testRollDice() {
		try {
			int out = snakeAndLadder.rollDice();
			if (1 < out) {
				assertTrue(true);
			} else if (out < 6) {
				assertTrue(true);
			} else {
				fail();
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Test method for {@link com.ideas.main.SnakeAndLadder#beginNewGame()}.
	 */
	@Test
	public void testBeginNewGame() {
		try {
			snakeAndLadder.beginNewGame();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
