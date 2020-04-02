package capter04.c5.store;

import capter04.c5.store.domain.Cheese;
import capter04.c5.store.domain.Clams;
import capter04.c5.store.domain.Dough;
import capter04.c5.store.domain.Pepperoni;
import capter04.c5.store.domain.Sauce;
import capter04.c5.store.domain.Veggies;

public abstract class Pizza {
	protected String name;
	protected PizzaIngredientFactory pf;
	
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	public abstract void prepare();

	public Pizza(PizzaIngredientFactory pf) {
		this.pf = pf;
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
