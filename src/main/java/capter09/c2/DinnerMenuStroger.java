package capter09.c2;
import java.util.Iterator;

/**
 * 餐厅菜单 内部类实现
 * @author snail
 *
 */
public class DinnerMenuStroger implements Menu{
	
	private static final int MAX_LENGTH = 6;
	
	private int numberOfItems = 0;
	
	private MenuItem[] menuItems;
	
	public DinnerMenuStroger() {
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
		return new Ite();
	}
	
	private class Ite implements Iterator<MenuItem>{
		private int position;

		@Override
		public boolean hasNext() {
			return menuItems.length>position && null!=menuItems[position];
		}

		@Override
		public MenuItem next() {
			if(hasNext()) {
				return menuItems[position++];
			}
			return null;
		}
		@Override
		public void remove(){
			if(position <= 0) {
				System.out.println("not support remove");
			}
			else {
				if(menuItems[position-1]!=null) {
					for(int i = position-1;i<menuItems.length; i++) {
						menuItems[i] = menuItems[i+1];
					}
					menuItems[menuItems.length-1] = null;
				}
			}
		}
	}
	
}
