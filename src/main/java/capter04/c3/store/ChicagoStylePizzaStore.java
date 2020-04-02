package capter04.c3.store;

import capter04.c3.pizza.ChicagoStypeClamPizza;
import capter04.c3.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStroe{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new ChicagoStypeClamPizza();
		}else if(type.equals("pepperoni")) {
			pizza = new ChicagoStypeClamPizza();
		}else if(type.equals("clam")) {
			pizza = new ChicagoStypeClamPizza();
		}else if(type.equals("veggie")) {
			pizza = new ChicagoStypeClamPizza();
		}
		return pizza;
	}

}
