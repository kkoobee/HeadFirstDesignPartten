package capter02.c1.subject;

import capter02.c1.observer.Observer;

/**
 * 主题
 * @author xuchuanliangbt
 *
 */
public interface Subject {
	
	/**
	 * 注册观察者
	 * @param o
	 */
	public void registerObserver(Observer o);
	
	/**
	 * 删除观察者
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 通知所有观察者
	 */
	public void notifyObservers();
}
