package capter09.c2;
import java.util.Iterator;

/**
 * 招待员
 * @author snail
 *
 */
public class Waitress {
	
	private Menu dinnerMenu;
	private Menu pancakeHouseMenu;
	private Iterator itreator;
	
	public Waitress(Iterator itreator) {
		this.itreator = itreator;
	}
	
	public Waitress(Menu dinnerMenu,Menu pancakeHouseMenu) {
		this.dinnerMenu = dinnerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	
	public void printMenus() {
		Iterator dinnerIterator = dinnerMenu.createIterator();
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		System.out.println("--------");
		printMenus(dinnerIterator);
		System.out.println("--------");
		printMenus(pancakeIterator);
	}

	private void printMenus(Iterator iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
