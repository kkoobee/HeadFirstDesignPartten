package capter09.c2;

import java.util.List;
import java.util.Iterator;
public class PancakeHouseMenuIterator implements Iterator<MenuItem>{
	
	private List menuItems;
	private int position = 0;

	public PancakeHouseMenuIterator(List menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		return position<menuItems.size() && menuItems.get(position)!=null;
	}

	@Override
	public MenuItem next() {
		if(hasNext()) {
			return (MenuItem)menuItems.get(position++);
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
