package capter06.c2;

public class CeilingFanHighCommand implements Command{
	private CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
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
