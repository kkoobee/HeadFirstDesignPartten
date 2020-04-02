package capter03.c1.impl.decker;

import capter03.c1.component.Beverage;
import capter03.c1.decker.CondimentDecorator;

public class Whip extends CondimentDecorator{
	
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+"¡¢Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.55;
	}
}
