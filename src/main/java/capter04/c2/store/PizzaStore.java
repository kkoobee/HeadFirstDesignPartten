package capter04.c2.store;

import capter04.c1.pizza.Pizza;

public abstract class PizzaStore {
	
	abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.pizza();
		return pizza;
	}
}
