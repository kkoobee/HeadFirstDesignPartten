package capter06.c2;

/**
 * ����ģʽ������ӿ�
 * @author xuchuanliangbt
 *
 */
public interface Command {
	/**
	 * ִ�е�ǰ�����
	 */
	void execute();
	
	/**
	 * ��������
	 */
	void undo();
}
