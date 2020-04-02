package capter05;

/**'
 * 2018年1月1日 15:04:50
 * 单例模式
 * @author snail
 *
 */
public class Singleton {
	
	private static Singleton uniqueInstance; 
	
	private Singleton() {
		
	}
	/**
	 * 该方法的好处：延迟实例化
	 * @return
	 */
	public static Singleton getInstance() {
		if(null==uniqueInstance) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
}
