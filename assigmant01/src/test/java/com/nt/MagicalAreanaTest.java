package com.nt;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagicalAreanaTest {

	@Test
	public void testFight() {
		Player playerA=new Player(50,5,10);
		Player playerB=new Player(100,10,5);
		
		MagicalArena arena=new MagicalArena(playerA,playerB);
		arena.fight();
		assertFalse(playerA.isAlive()&& playerB.isAlive());//any one will dead  
	}

}
