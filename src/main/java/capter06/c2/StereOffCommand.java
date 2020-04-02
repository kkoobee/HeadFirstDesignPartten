package capter06.c2;

/**
 * ´ò¿ªÒôÏìÃüÁî
 * @author xuchuanliangbt
 *
 */
public class StereOffCommand implements Command{
	
	private Stere stere;
	
	public StereOffCommand(Stere stere) {
		this.stere = stere;
	}
	
	@Override
	public void execute() {
		stere.off();
		
	}

	@Override
	public void undo() {
		stere.on();
	}
}
