package capter09.c4;

/**
 * 组合模式
 * @author xuchuanliangbt
 *
 */
public class Waitress {
	
	private MenuComponent allComponent;

	public Waitress(MenuComponent allComponent) {
		super();
		this.allComponent = allComponent;
	}
	
	public void print() {
		allComponent.print();
	}
}
