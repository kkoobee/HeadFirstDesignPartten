package capter06.c1;

/**
 * ��������ģʽ�Ŀͻ�
 * @author xuchuanliangbt
 *
 */
public class CommandTest {
	public static void main(String[] args) {
		
		/**
		 * ң�������ǵ����ߣ��ᴫ��һ��������󣬿���������������
		 */
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		/**
		 * ���ڴ���һ����ƶ��󣬴ζ���Ҳ������Ľ�����
		 */
		Light light = new Light();
		
		GarageDoor garageDoor = new GarageDoor();
		
		/**
		 * ���ﴴ��һ�����Ȼ�󽫽����ߴ�����
		 */
		LightCommand lightOn = new LightCommand(light);
		
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		/**
		 * ������ݸ�������
		 */
		remote.setCommand(lightOn);
		
		/**
		 * ģ�ⰴ��
		 */
		remote.ButtonWasPresses();
		
		remote.setCommand(garageDoorOpenCommand);
		
		remote.ButtonWasPresses();
	}
}
