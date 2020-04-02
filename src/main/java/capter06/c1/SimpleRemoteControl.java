package capter06.c1;

/**
 * 遥控器类
 * @author xuchuanliangbt
 *
 */
public class SimpleRemoteControl {
	
	/**
	 * 有一个插槽控制命令，而这个命令控制着一个装置
	 */
	Command slot;
	
	public SimpleRemoteControl() {}
	
	/**
	 * 这个方法用来设置插槽控制的命令，如果这段代码的客户想要
	 * 改变遥控器按钮的行为，可以多次调用这个方法
	 * @param slot
	 */
	public void setCommand(Command command) {
		this.slot = command;
	}

	/**
	 * 当按下该按钮时，这个方法会被调用，使得当前命令衔接插槽，并调用它的execute方法
	 */
	public void ButtonWasPresses() {
		slot.execute();
	}
}
