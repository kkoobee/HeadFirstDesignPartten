package capter01.c4.test;

import capter01.c4.Duck;
import capter01.c4.duck.MallardDuck;
import capter01.c4.duck.ModelDuck;
import capter01.c4.fly.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck duck = new ModelDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		duck.swim();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
}
