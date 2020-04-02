package capter04.c1.factory;

import capter04.c1.pizza.CheesePizza;
import capter04.c1.pizza.ClamPizza;
import capter04.c1.pizza.PepperoniPizza;
import capter04.c1.pizza.Pizza;
import capter04.c1.pizza.VeggiePizza;

/**
 * 简单工厂模式
 * @author xuchuanliangbt
 *
 */
public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
	
}
