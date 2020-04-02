package capter03.c1.impl.beverage;

import capter03.c1.component.Beverage;

public class Decaf extends Beverage{
	public Decaf() {
		description = "Decaf";
	}
	@Override
	public double cost() {
		return 0.78;
	}
}
