package capter04.c5.NYStore;

import capter04.c5.store.Pizza;
import capter04.c5.store.PizzaIngredientFactory;

public class NYPizza extends Pizza{

	public NYPizza (PizzaIngredientFactory pf) {
		super(pf);
	} 
	
	@Override
	public void prepare() {
		System.out.println("prepareing"+name);
		pf.createDough();
		pf.createSauce();
		pf.createCheese();
	}

}
