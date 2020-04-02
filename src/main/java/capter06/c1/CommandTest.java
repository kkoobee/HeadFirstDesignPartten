package capter06.c1;

/**
 * 这是命令模式的客户
 * @author xuchuanliangbt
 *
 */
public class CommandTest {
	public static void main(String[] args) {
		
		/**
		 * 遥控器就是调用者，会传入一个命令对象，可以用来发送请求
		 */
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		/**
		 * 现在创建一个电灯对象，次对象也是请求的接收者
		 */
		Light light = new Light();
		
		GarageDoor garageDoor = new GarageDoor();
		
		/**
		 * 这里创建一个命令，然后将接收者传给它
		 */
		LightCommand lightOn = new LightCommand(light);
		
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		/**
		 * 把命令传递给调用者
		 */
		remote.setCommand(lightOn);
		
		/**
		 * 模拟按下
		 */
		remote.ButtonWasPresses();
		
		remote.setCommand(garageDoorOpenCommand);
		
		remote.ButtonWasPresses();
	}
}
