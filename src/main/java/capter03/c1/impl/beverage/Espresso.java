package capter03.c1.impl.beverage;

import capter03.c1.component.Beverage;

public class Espresso extends Beverage{
	
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
