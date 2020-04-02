package capter01.c3;

import capter01.c3.fly.FlyWithWings;
import capter01.c3.quack.Quack;
import capter01.c3.quack.QuackBehavior;

public class RedDuck extends Duck{
	public RedDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new QuackBehavior() {
			
			@Override
			public void quack() {
				System.out.println("我自己叫");
				
			}
		};
	}
	@Override
	void display() {
		System.out.println("我是红鸭子");
	}
	
	void duck(){
		quackBehavior.quack();
	}
}
