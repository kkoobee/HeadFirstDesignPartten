package capter06.c2;

/**
 * �س��Ŷ���
 * @author xuchuanliangbt
 *
 */
public class GarageDoorCloseCommand implements Command {
	
	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.close();
		
	}

	@Override
	public void undo() {
		garageDoor.open();
	}

}
