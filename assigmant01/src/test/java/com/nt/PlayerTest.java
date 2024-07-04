package com.nt;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testAttack() {
		Player player=new Player(50,5,10);
		int attackRole=player.attack();
	assertTrue("Attack roll Should be between 1 to 6 ",attackRole>=1 && attackRole<=6);
	}
	@Test
	public void testDefend() {
		Player player=new Player(100,5,10);
		int defenseRole=player.defend();
		assertTrue("Attack roll Should be between 1 to 6 ",defenseRole>=1 && defenseRole<=6);
	}

}
