package capter06.c2;

/**
 * πÿ±’µı…»√¸¡Ó
 * @author xuchuanliangbt
 *
 */
public class CeilingFanOnCommand implements Command{
	
	private CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.on();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}
}
