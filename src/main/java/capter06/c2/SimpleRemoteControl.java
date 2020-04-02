package capter06.c2;

/**
 * 遥控器
 * @author xuchuanliangbt
 *
 */
public class SimpleRemoteControl {
	
	/**
	 * 开关命令数组
	 */
	Command[] onCommand;
	Command[] offCommand;
	
	/**
	 * 撤销命令，用于记录最后一次操作的命令，方便撤销
	 */
	Command undoCommand;
	
	public SimpleRemoteControl() {
		/**
		 * 构造器中执行命令初始化，初始化空命令
		 * 这一步的目的就是为了避免每次调用遥控器的按钮时需要判空，则预先给每个按钮初始化一个空的命令
		 * 此处空对象的作用非常明显，后面可以考虑借鉴
		 */
		
		onCommand = new Command[7];
		offCommand = new Command[7];
		
		for(int i=0; i<7; i++) {
			onCommand[i] = new NoCommand();
			offCommand[i] = new NoCommand();
		}
		undoCommand = new NoCommand();
	}
	
	/**
	 * 设置命令，设置对应插槽的开关命令
	 * @param solt
	 * @param onC
	 * @param offC
	 */
	public void setCommand(int solt,Command onC,Command offC) {
		onCommand[solt] = onC;
		offCommand[solt] = offC;
	}
	
	/**
	 * 按下按钮操作
	 * @param solt
	 */
	public void onButtonWasPushed(int solt) {
		onCommand[solt].execute();
		undoCommand = onCommand[solt];
	}
	
	public void offButtonWasPushed(int solt) {
		offCommand[solt].execute();
		undoCommand = offCommand[solt];
	}
	
	/**
	 * 撤销按钮
	 */
	public void undoButtonWasPushed() {
		undoCommand.execute();
	}
	
	
	
}
