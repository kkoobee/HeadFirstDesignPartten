package capter03.c1.decker;

import capter03.c1.component.Beverage;

/**
 * 装饰者类：调料装饰者
 * @author xuchuanliangbt
 *
 */
public abstract class CondimentDecorator extends Beverage{

	@Override
	public abstract String getDescription() ;
}
