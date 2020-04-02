package capter04.c3.store;

import capter04.c3.pizza.NYStyleCheesePizza;
import capter04.c3.pizza.Pizza;

public class NYStylePizzaStroe extends PizzaStroe{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		}else if(type.equals("peppronil")) {
			pizza = new NYStyleCheesePizza();
		}
		return pizza;
	}

}
