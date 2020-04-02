package capter04.c5.NYStore;

import capter04.c4.bean.veggies.Garlic;
import capter04.c5.NYStore.domain.FreshClams;
import capter04.c5.NYStore.domain.MarinaraSauce;
import capter04.c5.NYStore.domain.Mushroom;
import capter04.c5.NYStore.domain.Onion;
import capter04.c5.NYStore.domain.RedPepper;
import capter04.c5.NYStore.domain.ReggianoCheese;
import capter04.c5.NYStore.domain.SlicedPepperoni;
import capter04.c5.NYStore.domain.ThinCrustDough;
import capter04.c5.store.PizzaIngredientFactory;
import capter04.c5.store.domain.Cheese;
import capter04.c5.store.domain.Clams;
import capter04.c5.store.domain.Dough;
import capter04.c5.store.domain.Pepperoni;
import capter04.c5.store.domain.Sauce;
import capter04.c5.store.domain.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = {  new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}

	@Override
	public Clams createClams() {
		return null;
	}
}
