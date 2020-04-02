package capter01.c3;

import capter01.c3.fly.FlyBehavior;
import capter01.c3.quack.QuackBehavior;

public class Duck{
	
	public FlyBehavior flyBehavior;
	
	public QuackBehavior quackBehavior;
	
	 void display() {}
	
	 void performQuack() {
		 quackBehavior.quack();
	 }
	
	 void performFly() {
		 flyBehavior.fly();
	 }

}
