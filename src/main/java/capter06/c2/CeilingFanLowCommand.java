package capter06.c2;

public class CeilingFanLowCommand implements Command{
	private CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		if(CeilingFan.HIGH == prevSpeed) {
			ceilingFan.high();
		}else if(CeilingFan.MEDIUM == prevSpeed) {
			ceilingFan.medium();
		}else if(CeilingFan.LOW == prevSpeed) {
			ceilingFan.low();
		}
	}
}
