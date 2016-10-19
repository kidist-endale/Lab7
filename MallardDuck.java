package com.mpp.lab5.prob2;

public class MallardDuck extends Duck{

public MallardDuck() {
		//flybehavior.flywithwings();
		this.flywithwings();
		this.quack();
		//quackbehavior.quack();
		
	}

	@Override
	public void display() {
		//MallardDuck breedmalard = new MallardDuck();
		System.out.println("I am MallardDuck");
		
		
	}

}
