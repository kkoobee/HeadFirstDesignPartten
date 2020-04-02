package capter06.c2;

/**
 * 遥控器测试类，加载遥控器命令
 * @author xuchuanliangbt
 *
 */
public class RemoteLoader {
	public static void main(String[] args) {
		
		/**
		 * 创建发布命令的类
		 */
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		
		/**
		 * 创建接受命令的类
		 */
		Light livingRoomLigh = new Light();
		Light kitchenLight = new Light();
		CeilingFan ceilingFan = new CeilingFan();
		GarageDoor cDoor = new GarageDoor();
		Stere stere = new Stere();
		
		/**
		 * 创建命令对象
		 */
		LightOnCommand livingRoomOn = new LightOnCommand(livingRoomLigh);
		LightOffCommand livingRoomOff = new LightOffCommand(livingRoomLigh);
		LightOnCommand kitchenOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand cDoorOpenCommand = new GarageDoorOpenCommand(cDoor);
		GarageDoorCloseCommand cDoorCloseCommand = new GarageDoorCloseCommand(cDoor);
		
		StereOnCommand stereOnCommand = new StereOnCommand(stere);
		StereOffCommand stereOffCommand = new StereOffCommand(stere);
		
		simpleRemoteControl.setCommand(0, livingRoomOn, livingRoomOff);
		simpleRemoteControl.setCommand(1, kitchenOn, kitchenOff);
		simpleRemoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
		simpleRemoteControl.setCommand(3, cDoorOpenCommand, cDoorCloseCommand);
		simpleRemoteControl.setCommand(4, stereOnCommand, stereOffCommand);
		
		simpleRemoteControl.onButtonWasPushed(0);
		simpleRemoteControl.offButtonWasPushed(0);
		
		simpleRemoteControl.onButtonWasPushed(1);
		simpleRemoteControl.offButtonWasPushed(1);
		
		simpleRemoteControl.onButtonWasPushed(2);
		simpleRemoteControl.offButtonWasPushed(2);
		
		simpleRemoteControl.onButtonWasPushed(3);
		simpleRemoteControl.offButtonWasPushed(3);
		
		simpleRemoteControl.onButtonWasPushed(4);
		simpleRemoteControl.offButtonWasPushed(4);
		
	}
}
