package com.kenya.zookeeper1;

public class Bat extends Mammal {
//---- pass in our a var to use in the test -----
	public Bat(int energy) {
		super(energy);		
	}
	
	public void fly() {
		setEnergyLevel(getEnergyLevel() - 50);
		System.out.println("Flying decreases energy by 50: " + getEnergyLevel());	
	}
	
	public void eatHumans() {
		setEnergyLevel(getEnergyLevel() + 25);
		System.out.println("Eating Humans increases by 25 : " + getEnergyLevel());
		
	}
	
	public void attackTown() {
		setEnergyLevel(getEnergyLevel() - 100);
		System.out.println("Attacking the Town (SOMEONE COME GET THIS BAT!):  " + getEnergyLevel());
		
	}

	

}
