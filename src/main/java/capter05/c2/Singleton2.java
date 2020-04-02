package capter05.c2;

/**
 * 单例模式：急加载，无线程问题，但是会在项目启动时就创建对象，可能会造成资源浪费
 * @author snail
 *
 */
public class Singleton2 {
	private static Singleton2 uniqueInstance = new Singleton2();
	
	private Singleton2() {}
	
	public static Singleton2 getInstance () {
		return uniqueInstance;
	}
	
}
