package capter09.c2;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 煎饼屋菜单实现
 * @author snail
 *
 */
public class PancakeHouseMenu implements Menu{
	/**
	 * 菜单
	 */
	private ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();
		addItem("白菜","白菜描述",true,12.3);
		addItem("菠菜","菠菜描述",true,12.3);
		addItem("南瓜","南瓜描述",true,12.3);
		addItem("黄瓜","黄瓜描述",true,12.3);
		addItem("丝瓜","丝瓜描述",true,12.3);
		addItem("冬瓜","冬瓜描述",true,12.3);
	}
	
	public void addItem(String name,String desc,Boolean vege,Double price) {
		MenuItem m = new MenuItem(name, desc, vege, price);
		menuItems.add(m);
	}
	
	public Iterator<MenuItem> createIterator(){
		return new PancakeHouseMenuIterator(menuItems);
	}
}
