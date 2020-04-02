package capter04.c5.CPStroe;

import capter04.c5.CPStroe.domain.BlackOlives;
import capter04.c5.CPStroe.domain.Eggplant;
import capter04.c5.CPStroe.domain.FrozenClams;
import capter04.c5.CPStroe.domain.MozzarellaCheese;
import capter04.c5.CPStroe.domain.PlumTomatoSauce;
import capter04.c5.CPStroe.domain.SlicedPepperoni;
import capter04.c5.CPStroe.domain.Spinach;
import capter04.c5.CPStroe.domain.ThickCrustDough;
import capter04.c5.store.PizzaIngredientFactory;
import capter04.c5.store.domain.Cheese;
import capter04.c5.store.domain.Clams;
import capter04.c5.store.domain.Dough;
import capter04.c5.store.domain.Pepperoni;
import capter04.c5.store.domain.Sauce;
import capter04.c5.store.domain.Veggies;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}

	@Override
	public Clams createClams() {
		return null;
	}
}
