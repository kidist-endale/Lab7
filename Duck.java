package com.mpp.lab5.prob2;

//package lesson5duckassignment;

public abstract class Duck implements FlyBehavior,QuackBehavior {
	//FlyBehavior flybehavior;
	//QuackBehavior quackbehavior;
	
	public abstract void display();
	
	public void fly()
	{
		FlyBehavior flybehavior;
	}
	public void quack()
	{
		QuackBehavior quackbehavior;
	}
	public void swim(){
		System.out.println("I can swim");
		
	}
	
	
}
