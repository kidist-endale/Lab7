package com.mpp.lab5.prob2;

public interface QuackBehavior {
	
	
	default public void quack() {
		System.out.println("I can quack!");
		
	}
	
	default public void squeak() {
		System.out.println("I can squeak!");
		
	}
	
	default public void mutequack() {
		System.out.println("I mute quack!");
		
	}
	/*Quack Quacksound = new Quack();
	Squeak Squeaksound = new Squeak();
	MuteQuack NoSound = new MuteQuack();
	void quack();*/
	
}
