package com.nt;

public class MagicalArena {
public Player playerA;
public Player playerB;

public MagicalArena(Player playerA, Player playerB) {
	
	this.playerA = playerA;
	this.playerB = playerB;
}
public void fight() {
	Player attacker=playerA.health<playerB.health?playerA:playerB;
	Player defender=attacker==playerA?playerB:playerA;
	
	while(playerA.isAlive()&& playerB.isAlive()) {
		int attackRoll=attacker.attack();
		int defenseRoll=defender.defend();
		
		int damage=attackRoll*attacker.attack-defenseRoll*defender.strength;
		if(damage>0) {
			defender.reduceHealth(damage);
		}
		//swap roll for next round
		
		Player temp=attacker;
		attacker=defender;
		defender=temp;
		
		
	}
	if(playerA.isAlive())System.out.println("PlayerA is Win");
	else System.out.println("PlayerB is Win");
	

}


}
