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
				System.out.println("���Լ���");
				
			}
		};
	}
	@Override
	void display() {
		System.out.println("���Ǻ�Ѽ��");
	}
	
	void duck(){
		quackBehavior.quack();
	}
}
