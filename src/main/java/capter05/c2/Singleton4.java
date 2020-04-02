package capter05.c2;

/**
 * 单例模式：懒加载，同时解决多线程和资源浪费问题
 * 双重锁
 * @author snail
 *
 */
public class Singleton4 {
	private static volatile Singleton4 uniqueInstance;
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		if(null == uniqueInstance) {
			synchronized (Singleton4.class) {
				if(null == uniqueInstance) {
					uniqueInstance = new Singleton4();
				}
			}
		}
		return uniqueInstance;
	}
	
}
