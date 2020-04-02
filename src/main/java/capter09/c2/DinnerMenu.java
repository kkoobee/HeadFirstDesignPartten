package capter09.c2;
import java.util.Iterator;

/**
 * 餐厅菜单
 * @author snail
 *
 */
public class DinnerMenu implements Menu{
	
	private static final int MAX_LENGTH = 6;
	
	private int numberOfItems = 0;
	
	private MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_LENGTH];
		addItem("白菜","白菜描述",true,12.3);
		addItem("菠菜","菠菜描述",true,12.3);
		addItem("南瓜","南瓜描述",true,12.3);
		addItem("黄瓜","黄瓜描述",true,12.3);
		addItem("丝瓜","丝瓜描述",true,12.3);
		addItem("冬瓜","冬瓜描述",true,12.3);
	}
	
	public void addItem(String name,String desc,Boolean vege,Double price) {
		if(numberOfItems >= MAX_LENGTH) {
			System.out.println("sorr,menu is full! can not add item to menu");
		}else {
			MenuItem m = new MenuItem(name, desc, vege, price);
			menuItems[numberOfItems++] = m;
		}
	}
	
	public Iterator<MenuItem> createIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
