package com.advancedoopassign;

public class Pokemon {
	String name;
	int health;
	String type;
	public static int count = 0;
	
	public Pokemon(String name, int health,String type) {
		this.name = name;
		this.health = health;
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	public static int getCount() {
		return count;
	}
	public String getType() {
		return this.type;
	}
	
	public int getHealth() {
		return this.health;
	}

}
