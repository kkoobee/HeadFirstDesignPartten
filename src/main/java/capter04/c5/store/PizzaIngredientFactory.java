package capter04.c5.store;

import capter04.c5.store.domain.Cheese;
import capter04.c5.store.domain.Clams;
import capter04.c5.store.domain.Dough;
import capter04.c5.store.domain.Pepperoni;
import capter04.c5.store.domain.Sauce;
import capter04.c5.store.domain.Veggies;

/**
 * 原料工程
 * @author xuchuanliangbt
 *
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
