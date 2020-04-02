package capter03.c1.impl.beverage;

import capter03.c1.component.Beverage;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
