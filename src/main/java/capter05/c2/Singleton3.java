package capter05.c2;

/**
 * 单例模式：懒加载，同时解决线程问题
 * 在方法上加锁：这样的问题：实例只创建一次，但是每次访问方法都会进入同步方法，导致累赘，同步一个方法可能会造成程序执行效率下降100倍
 * 不推荐使用，首推Singleton4>singleton2>singleton3
 * @author snail
 *
 */
public class Singleton3 {
	private static Singleton3 uniqueInstance;
	
	private Singleton3() {}
	
	public static synchronized Singleton3 getInstance() {
		if(null == uniqueInstance) {
			uniqueInstance = new Singleton3();
		}
		return uniqueInstance;
	}
}
