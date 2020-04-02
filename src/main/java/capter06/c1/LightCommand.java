package capter06.c1;

/**
 * 灯泡命令实现类:这是操控灯泡的命令
 * @author xuchuanliangbt
 *
 */
public class LightCommand implements Command{
	
	private Light light;
	
	/**
	 * 构造器传入某个电灯泡，以便让这个命令控制，然后保存在实例变量中。一旦调用execute()就由这个灯泡对象称为接收者，负责接收请求
	 * @param light
	 */
	public LightCommand(Light light) {
		this.light = light;
	}

	/**
	 * 这个execute()方法负责调用接收对象
	 */
	@Override
	public void execute() {
		light.on();
	}

}
