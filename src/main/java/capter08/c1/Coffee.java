package capter08.c1;

/**
 * 模板模式-封装算法
 * 咖啡类
 * @author snail
 *
 */
public class Coffee {
	
	/**
	 * 冲泡咖啡
	 */
	public void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugerAndMilk();
	}
	
	/**
	 * 烧开热水
	 */
	public void boilWater() {
		System.out.println("boil water");
	}
	
	/**
	 * 用沸水冲泡咖啡
	 */
	public void brewCoffeeGrinds() {
		System.out.println("dripping coffee through filter");
	}
	
	/**
	 * 把咖啡倒入杯子里
	 */
	public void pourInCup() {
		System.out.println("pouring into cup");
	}
	
	/**
	 * 加糖和牛奶
	 */
	public void addSugerAndMilk() {
		System.out.println("adding suger and milk");
	}
}
