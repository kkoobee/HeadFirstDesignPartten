package capter08.c2;

/**
 * 模板模式-封装算法
 * 咖啡类
 * @author snail
 *
 */
public class Tea extends CaffeineBeverage{
	
	/**
	 * 用沸水泡茶叶
	 */
	public void add() {
		System.out.println("steeping the tea");
	}
	
	/**
	 * 加柠檬
	 */
	public void steep() {
		System.out.println("adding lemon");
	}
	
}
