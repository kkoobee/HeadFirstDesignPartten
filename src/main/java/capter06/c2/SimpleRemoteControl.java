package capter06.c2;

/**
 * ң����
 * @author xuchuanliangbt
 *
 */
public class SimpleRemoteControl {
	
	/**
	 * ������������
	 */
	Command[] onCommand;
	Command[] offCommand;
	
	/**
	 * ����������ڼ�¼���һ�β�����������㳷��
	 */
	Command undoCommand;
	
	public SimpleRemoteControl() {
		/**
		 * ��������ִ�������ʼ������ʼ��������
		 * ��һ����Ŀ�ľ���Ϊ�˱���ÿ�ε���ң�����İ�ťʱ��Ҫ�пգ���Ԥ�ȸ�ÿ����ť��ʼ��һ���յ�����
		 * �˴��ն�������÷ǳ����ԣ�������Կ��ǽ��
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
	 * ����������ö�Ӧ��۵Ŀ�������
	 * @param solt
	 * @param onC
	 * @param offC
	 */
	public void setCommand(int solt,Command onC,Command offC) {
		onCommand[solt] = onC;
		offCommand[solt] = offC;
	}
	
	/**
	 * ���°�ť����
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
	 * ������ť
	 */
	public void undoButtonWasPushed() {
		undoCommand.execute();
	}
	
	
	
}
