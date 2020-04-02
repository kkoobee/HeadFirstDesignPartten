package capter09.c2;

/**
 * 自己实现迭代器接口
 * @author snail
 *
 */
public interface Iterator<T> {
	boolean hasNext();
	T next();
}
