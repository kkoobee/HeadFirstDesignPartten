package capter09.c4;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	
	private ArrayList<MenuComponent> child = new ArrayList<>();

	private String name;
	
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		child.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		child.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return child.get(i);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.println("Menu [child=" + child + ", name=" + name + ", description=" + description + "]");
		Iterator<MenuComponent> iterator = child.iterator();
		while(iterator.hasNext()) {
			iterator.next().print();
		}
	}
	
}
