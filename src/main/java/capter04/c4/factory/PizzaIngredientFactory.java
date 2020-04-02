package capter04.c4.factory;

import capter04.c4.bean.Cheese;
import capter04.c4.bean.Clams;
import capter04.c4.bean.Dough;
import capter04.c4.bean.Pepperoni;
import capter04.c4.bean.Sauce;
import capter04.c4.bean.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
