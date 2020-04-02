package capter01.c4.duck;

import capter01.c4.Duck;
import capter01.c4.fly.FlyWithNoWay;
import capter01.c4.quack.MutoQuack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super.flyBehavior = new FlyWithNoWay();
		quackBehavior = new MutoQuack();
	}
	
	@Override
	public void display() {
		System.out.println("i am super duck");
		
	}
	
}
