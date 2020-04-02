package capter01.c4.duck;

import capter01.c4.Duck;
import capter01.c4.fly.FlyWithNoWay;
import capter01.c4.quack.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		super.flyBehavior = new FlyWithNoWay();
		super.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("i am a model duck");
		
	}

}
