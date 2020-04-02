package capter06.c2;

/**
 * ���س��Ŷ���
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
