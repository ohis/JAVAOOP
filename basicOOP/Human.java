package com.codingdojo.projectone;

public class Human {
	int stealth = 3;
	int strength = 3;
	int intelligence = 3;
	int health = 100;
	
	public void attack(Human man) {
		System.out.println("A human is being attacked");
		man.health -= this.strength;
		System.out.println("The attacked human's health is "+man.health);
		
	}

}
