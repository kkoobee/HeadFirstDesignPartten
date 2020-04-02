package capter03.c1.impl.decker;

import capter03.c1.component.Beverage;
import capter03.c1.decker.CondimentDecorator;

/**
 * 调料装饰者
 * @author xuchuanliangbt
 *
 */
public class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return beverage.cost()+0.2;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+"、Mocha";
	}
}
