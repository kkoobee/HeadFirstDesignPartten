package capter07.c2;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * ÊÊÅäÆ÷Ä£Ê½
 * @author xuchuanliangbt
 *
 */
public class EnumerationIterator<T> implements Iterator<T>{

	private Enumeration<T> enumeration;
	
	public EnumerationIterator(Enumeration<T> enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public T next() {
		return enumeration.nextElement();
	}

}
