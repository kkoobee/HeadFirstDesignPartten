package capter06.c2;

/**
 * ¹Ø±ÕÒôÏìÃüÁî
 * @author xuchuanliangbt
 *
 */
public class StereOnCommand implements Command{
	
	private Stere stere;
	
	public StereOnCommand(Stere stere) {
		this.stere = stere;
	}
	
	@Override
	public void execute() {
		stere.on();
		stere.setCD();
		stere.setVoice(12);
	}

	@Override
	public void undo() {
		stere.off();
	}
}
