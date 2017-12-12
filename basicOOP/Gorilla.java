package com.codingdojo.projectone;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The Gorilla has thrown something");
		this.energyLevel-=5;
		System.out.println("tHe gorilla energy level is "+energyLevel);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla is satisfied");
		this.energyLevel+=10;
		System.out.println("tHe gorilla energy level is "+energyLevel);
	}
    
	public void climb() {
		System.out.println("The gorilla has climbed a tree");
		this.energyLevel-=10;
		System.out.println("tHe gorilla energy level is "+energyLevel);
	}
}
