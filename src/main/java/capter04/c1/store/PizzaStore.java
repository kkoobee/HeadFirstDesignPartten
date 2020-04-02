package capter04.c1.store;

import capter04.c1.factory.SimplePizzaFactory;
import capter04.c1.pizza.Pizza;

public class PizzaStore {
	
	private SimplePizzaFactory simplePizzaFactory;

	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = simplePizzaFactory.createPizza(type);	
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		pizza.pizza();
		return pizza;
	}
}
