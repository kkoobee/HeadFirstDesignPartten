package capter06.c2;

/**
 * 开关车门对象
 * @author xuchuanliangbt
 *
 */
public class GarageDoorOpenCommand implements Command {
	
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.open();
		
	}

	@Override
	public void undo() {
		garageDoor.close();
	}

}
