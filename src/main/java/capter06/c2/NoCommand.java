package capter06.c2;

/**
 * 空对象，后期可以借鉴，不用判空，作用非常明显
 * @author xuchuanliangbt
 *
 */
public class NoCommand implements Command{

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}

}
