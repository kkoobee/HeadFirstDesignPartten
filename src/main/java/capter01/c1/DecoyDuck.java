package capter01.c1;

/**
 * 这是诱饵鸭
 * @author xuchuanliangbt
 *
 */
public class DecoyDuck extends Duck{
	/**
	 * 不会飞，所以空实现
	 */
	@Override
	void fly() {
	}
	
	/**
	 * 不会叫，所以空实现
	 */
	@Override
	void quak() {
	}

	@Override
	void display() {
		System.out.println("这是橡皮鸭子");
		
	}
}
