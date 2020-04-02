package capter06.c2;

public class CeilingFanMediumCommand implements Command{
	private CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
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
