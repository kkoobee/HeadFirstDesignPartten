package capter03.c1.component;

/**
 * װ�������ģʽ����:����
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
