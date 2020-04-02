package capter03.c1.impl.decker;

import capter03.c1.component.Beverage;
import capter03.c1.decker.CondimentDecorator;

/**
 * 调料装饰者
 * @author xuchuanliangbt
 *
 */
public class Soy extends CondimentDecorator{
	
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+"、Soy";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.65;
	}

}
