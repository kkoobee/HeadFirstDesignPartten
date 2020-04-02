package capter08.c1;

/**
 * 模板模式-封装算法
 * 咖啡类
 * @author snail
 *
 */
public class Tea {
	
	/**
	 * 准备茶
	 */
	public void prepareTea() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}
	
	/**
	 * 把水煮沸
	 */
	public void boilWater() {
		System.out.println("boiling water");
	}
	
	/**
	 * 用沸水泡茶叶
	 */
	public void steepTeaBag() {
		System.out.println("steeping the tea");
	}
	
	/**
	 * 加柠檬
	 */
	public void addLemon() {
		System.out.println("adding lemon");
	}
	
	/**
	 * 把茶倒入被子
	 */
	public void pourInCup() {
		System.out.println("pouring into cup");
	}
}
