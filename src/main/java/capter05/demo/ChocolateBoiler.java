package capter05.demo;

/**
 * 单例模式：巧克力锅炉
 * 此种方式会产生多线程问题
 * @author snail
 *
 */
public class ChocolateBoiler {
	
	/**
	 * 是否为空标识
	 */
	private boolean empty;
	
	/**
	 * 是否煮过标识
	 */
	private boolean boiled;
	
	private static ChocolateBoiler uniqueInstance;
	
	/**
	 * 私有化构造方法
	 */
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	/**
	 * 延迟初始化，获取实例
	 * 增加锁，解决多线程导致全局不是唯一对象问题，但是这样会降低性能
	 * 并且全局只初始化一次，但是每次调用都需要同步这个方法，同步是一个累赘
	 * @return
	 */
	public static synchronized ChocolateBoiler getInstantce () {
		if(null == uniqueInstance) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	/**
	 * 锅炉内放入材料
	 */
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//放入材料代码
		}
	}
	
	/**
	 * 锅炉排出产品
	 * @return
	 */
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			//排出产品
			empty = true;
			
		}
	}
	
	/**
	 * 煮沸产品
	 * @return
	 */
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//煮沸产品
			boiled = true;
		}
	}
	
	/**
	 * 判断锅炉是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return empty;
	}
	
	/**
	 * 判断是否煮过
	 * @return
	 */
	public boolean isBoiled() {
		return boiled;
	}
}
