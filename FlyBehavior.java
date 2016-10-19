package com.mpp.lab5.prob2;

public interface FlyBehavior {
	
	
	default void flywithwings()
	{
		System.out.println("I can fly with wings!");
	}
	
	default void cannotfly()
	{
		
			System.out.println("I can't fly");
	}
}
