package capter06.c2;

/**
 * 命令模式：命令接口
 * @author xuchuanliangbt
 *
 */
public interface Command {
	/**
	 * 执行当前命令方法
	 */
	void execute();
	
	/**
	 * 撤销方法
	 */
	void undo();
}
