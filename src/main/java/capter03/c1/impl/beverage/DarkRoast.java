package capter03.c1.impl.beverage;

import capter03.c1.component.Beverage;

public class DarkRoast extends Beverage{
	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return 0.56;
	}
}
