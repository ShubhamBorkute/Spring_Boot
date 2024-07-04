package com.nt;

import java.util.Random;

public class Player {
public int health;
public int strength;
public int attack;
public Random random;	

	public Player(int health, int strength, int attack) {
	this.health = health;
	this.strength = strength;
	this.attack = attack;
	this.random=new Random();
}

	public int attack() {
		int res=random.nextInt(6)+1;
		//System.out.println("attack "+res);
		return res;//six side dies roll

	}
	public int defend() {
		
		int res=random.nextInt(6)+1;
		//System.out.println("Defend "+res);
		return res;//six side dies roll
	}
	public void reduceHealth(int damage) {
		health-=damage;
	}
	public boolean isAlive() {
	return health>0;

	}


	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public int getStrength() {
		return strength;
	}



	public void setStrength(int strength) {
		this.strength = strength;
	}



	public int getAttack() {
		return attack;
	}



	public void setAttack(int attack) {
		this.attack = attack;
	}

	
}
