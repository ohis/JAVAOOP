package com.advancedoopassign;

public abstract class AbstractClass implements PokemonInterface {
	 public void createPokemon(String name,int health,String type) {
		 Pokemon p = new Pokemon(name,health,type);
		 p.getName();
		 p.getHealth();
		 p.getType();

	 };
	 
	 public void attackPokemon(Pokemon pokemon) {
		 pokemon.health-=10;
	 }
	
}
 

