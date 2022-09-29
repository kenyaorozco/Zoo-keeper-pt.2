package com.kenya.zookeeper1;

public class GorillaTest {

	public static void main(String[] args) {

		Mammal animal1 = new Mammal();
//		-------Gorilla Class----------
		Gorilla monkey1 = new Gorilla();
		
//		-------Gorilla Class----------
		Bat batthew = new Bat(300);
		
		animal1.displayEnergy();
		
//		-------Gorilla Class Methods----------
		monkey1.throwSomething();
		monkey1.throwSomething();
		monkey1.throwSomething();
		
		monkey1.eatBananas();
		monkey1.eatBananas();
		monkey1.climb();

		System.out.println("Overall energy: " + monkey1.displayEnergy());
		
//		-------Bat Class Methods----------
		//	Attacked Town 3 times	
		batthew.attackTown();
		batthew.attackTown();
		batthew.attackTown();
		// Ate 2 humans		
		batthew.eatHumans();
		batthew.eatHumans();
		// Flew around twice		
		batthew.fly();
		batthew.fly();

		
		System.out.println("Overall energy: " + batthew.displayEnergy());








	}

}
