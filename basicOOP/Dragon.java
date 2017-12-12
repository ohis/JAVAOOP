package com.codingdojo.projectone;

public class Dragon extends Mammal {
	int dragEnergy = 300;
	public Dragon() {
		this.energyLevel = dragEnergy;
	}
  
  public void fly() {
	  System.out.println("The dragon is taking off");
	  this.energyLevel-=50;
	  System.out.println("tHe dragon energy level is "+energyLevel);  
	  
  }
  
  public void eatHumans() {
	  System.out.println("So a human is eaten");
	  this.energyLevel+=25;
	  System.out.println("tHe dragon energy level is "+energyLevel);
  }
  
  public void attackTown() {
	  System.out.println("Town on fire");
	  this.energyLevel-=100;
	  System.out.println("tHe dragon energy level is "+energyLevel);
	  
  }
}
