package capter09.c4;

public class Test {
	public static void main(String[] args) {
		MenuComponent menuComponent1 = new Menu("111","111");
		MenuComponent menuComponent2 = new Menu("222","222");
		MenuComponent menuComponent3 = new Menu("333","333");
		MenuComponent menuComponent4 = new Menu("444","444");
		MenuComponent all = new Menu("all", "all");
		all.add(menuComponent4);
		all.add(menuComponent2);
		all.add(menuComponent3);
		all.add(menuComponent1);
		menuComponent4.add(menuComponent2);
		menuComponent4.add(menuComponent3);
		Waitress waitress = new Waitress(all);
		waitress.print();
	}
}
