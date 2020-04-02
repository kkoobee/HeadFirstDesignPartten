package capter02.c1.subject;

import capter02.c1.observer.Observer;

/**
 * ����
 * @author xuchuanliangbt
 *
 */
public interface Subject {
	
	/**
	 * ע��۲���
	 * @param o
	 */
	public void registerObserver(Observer o);
	
	/**
	 * ɾ���۲���
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * ֪ͨ���й۲���
	 */
	public void notifyObservers();
}
