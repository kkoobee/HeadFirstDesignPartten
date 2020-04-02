package capter04.c3.pizza;

import java.util.ArrayList;
/**
 * 抽象工厂实体类
 * @author xuchuanliangbt
 *
 */
public class Pizza {

	String name;

	String dough;

	String sauce;

	ArrayList toppings = new ArrayList<>();

	public void prepare() {
		System.out.println("preparing " + name);
		System.out.println("tossing dough...");
		System.out.println("adding sauce....");
		System.out.println("adding toppings:");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("     " + toppings.get(i));
		}
	}

	public void bake() {
		System.out.println("bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("cytting the pizza into diagonal slinces");
	}

	public void box() {
		System.out.println("place pizza in offical pizzastore box");
	}

	public void pizza() {
		System.out.println("show pizza");
	}

	public String getName() {
		return name;
	}
}
