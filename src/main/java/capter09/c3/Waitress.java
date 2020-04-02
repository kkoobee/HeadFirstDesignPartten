package capter09.c3;

import java.util.ArrayList;
import java.util.Iterator;

import capter09.c2.Menu;
import capter09.c2.MenuItem;

public class Waitress {
	
	private ArrayList menus;
	
	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	
	public void print() {
		Iterator<Menu> iterator = menus.iterator();
		while(iterator.hasNext()) {
			Menu m = iterator.next();
			privateMenu(m.createIterator());
		}
	}
	public void privateMenu(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
