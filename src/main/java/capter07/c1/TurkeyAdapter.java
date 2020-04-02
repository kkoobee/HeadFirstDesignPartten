package capter07.c1;

/**
 * 火鸡的装饰者类，装饰成鸭子类
 * @author xuchuanliangbt
 *
 */
public class TurkeyAdapter implements Duck{
	
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=1; i<6; i++) {
			turkey.fly();
		}
	}
}
