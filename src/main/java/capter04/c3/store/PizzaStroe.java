package capter04.c3.store;

import capter04.c3.pizza.Pizza;

/**
 * pizza���󹤳���
 * @author xuchuanliangbt
 *
 */
public abstract class PizzaStroe {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
