package capter06.c2;

/**
 * �򿪵�������
 * @author xuchuanliangbt
 *
 */
public class LightOffCommand implements Command{
	
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
	
}
