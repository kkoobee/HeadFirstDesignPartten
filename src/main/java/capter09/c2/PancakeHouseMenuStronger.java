package capter09.c2;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 煎饼屋菜单实现 内部类
 * @author snail
 *
 */
public class PancakeHouseMenuStronger implements Menu{
	/**
	 * 菜单
	 */
	private ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenuStronger() {
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
		return new Ite();
	}
	
	private class Ite implements Iterator<MenuItem>{
		private int position;

		@Override
		public boolean hasNext() {
			return menuItems.size()>position && null!=menuItems.get(position);
		}

		@Override
		public MenuItem next() {
			if(hasNext()) {
				return menuItems.get(position++);
			}
			return null;
		}
		@Override
		public void remove(){
			if(position <= 0) {
				System.out.println("not support remove");
			}
			else {
				if(menuItems.get(position-1)!=null) {
					for(int i = position-1;i<menuItems.size(); i++) {
						menuItems.set(i,menuItems.get(i+1));
					}
					menuItems.set(menuItems.size(),null);
				}
			}
		}
	}
}
