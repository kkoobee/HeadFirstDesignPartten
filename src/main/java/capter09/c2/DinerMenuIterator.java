package capter09.c2;
import java.util.Iterator;
public class DinerMenuIterator implements Iterator<MenuItem>{

	private MenuItem[] dinnerMenu;
	private int position = 0;
	
	public DinerMenuIterator(MenuItem[] dinnerMenu) {
		this.dinnerMenu = dinnerMenu;
	}
	
	@Override
	public boolean hasNext() {
		return position < dinnerMenu.length && dinnerMenu[position]!=null;
	}

	@Override
	public MenuItem next() {
		if(hasNext()) {
			return dinnerMenu[position++];
		}else {
			return null;
		}
	}
	
	@Override
	public void remove(){
		if(position <= 0) {
			System.out.println("not support remove");
		}
		else {
			if(dinnerMenu[position-1]!=null) {
				for(int i = position-1;i<dinnerMenu.length; i++) {
					dinnerMenu[i] = dinnerMenu[i+1];
				}
				dinnerMenu[dinnerMenu.length-1] = null;
			}
		}
	}

}
