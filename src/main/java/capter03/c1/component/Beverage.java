package capter03.c1.component;

/**
 * 装饰者设计模式超类:饮料
 * @author xuchuanliangbt
 *
 */
public abstract class Beverage {
	protected String description = "unknown beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
