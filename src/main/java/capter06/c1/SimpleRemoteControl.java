package capter06.c1;

/**
 * ң������
 * @author xuchuanliangbt
 *
 */
public class SimpleRemoteControl {
	
	/**
	 * ��һ����ۿ��������������������һ��װ��
	 */
	Command slot;
	
	public SimpleRemoteControl() {}
	
	/**
	 * ��������������ò�ۿ��Ƶ���������δ���Ŀͻ���Ҫ
	 * �ı�ң������ť����Ϊ�����Զ�ε����������
	 * @param slot
	 */
	public void setCommand(Command command) {
		this.slot = command;
	}

	/**
	 * �����¸ð�ťʱ����������ᱻ���ã�ʹ�õ�ǰ�����νӲ�ۣ�����������execute����
	 */
	public void ButtonWasPresses() {
		slot.execute();
	}
}
