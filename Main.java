package com.mpp.lab5.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Duck>ducks=new ArrayList<Duck>();
		ducks.add(new MallardDuck());
		ducks.add(new DecoyDuck());
		ducks.add(new RedheadDuck());
		ducks.add(new RubberDuck());
		for(Duck d: ducks) {
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
       
	}
}
//}
