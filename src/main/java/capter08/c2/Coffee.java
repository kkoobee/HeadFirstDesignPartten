package capter08.c2;

/**
 * 模板模式-封装算法
 * 咖啡类
 * @author snail
 *
 */
public class Coffee extends CaffeineBeverage{
	
	/**
	 * 用沸水冲泡咖啡
	 */
	public void add() {
		System.out.println("dripping coffee through filter");
	}
	
	/**
	 * 加糖和牛奶
	 */
	public void steep() {
		System.out.println("adding suger and milk");
	}
}
