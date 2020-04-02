package capter06.c2;

/**
 * �رյ�������
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
