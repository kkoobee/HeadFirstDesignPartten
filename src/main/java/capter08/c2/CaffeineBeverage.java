package capter08.c2;

public abstract class CaffeineBeverage {
	
	public final void prepareRecipe() {
		boilWater();
		pourInCup();
		steep();
		add();
	}
	
	/**
	 * 把水煮沸
	 */
	public void boilWater() {
		System.out.println("boiling water");
	}
	
	/**
	 * 把茶倒入杯子
	 */
	public void pourInCup() {
		System.out.println("pouring into cup");
	}
	
	/**
	 * 冲泡
	 */
	abstract void steep();
	
	/**
	 * 加调料
	 */
	abstract void add();
}
