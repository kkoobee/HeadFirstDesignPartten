package capter09.c2;

public class Test {
	public static void main(String[] args) {
		DinnerMenu dinnerMenu = new DinnerMenu();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		Waitress waitress = new Waitress(dinnerMenu, pancakeHouseMenu);
		waitress.printMenus();
		System.out.println(dinnerMenu);
		System.out.println(pancakeHouseMenu);
		System.out.println(waitress);
	}
}
