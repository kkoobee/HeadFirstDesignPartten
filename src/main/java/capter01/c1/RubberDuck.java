package capter01.c1;

/**
 * 橡皮鸭
 * @author xuchuanliangbt
 *
 */
public class RubberDuck extends Duck{
	@Override
	void display() {
		System.out.println("我是橡皮鸭");
		
	}
	@Override
	void quak() {
		System.out.println("我不会叫，我吱吱吱");
	}
	
	/**
	 * 不会飞，所以空实现
	 */
	@Override
	void fly() {
	}
}
