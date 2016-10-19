package com.mpp.lab5.prob2;

public class RubberDuck extends Duck {
	

	public RubberDuck() {
		this.cannotfly();
		this.squeak();
	}

	@Override
	public void display() {
		//RubberDuck myrubberduck = new RubberDuck();
		System.out.println("I am a rubber duck");
		
	}

	
}
