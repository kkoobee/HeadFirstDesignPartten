package capter06.c1;

/**
 * ��������ʵ����:���ǲٿص��ݵ�����
 * @author xuchuanliangbt
 *
 */
public class LightCommand implements Command{
	
	private Light light;
	
	/**
	 * ����������ĳ������ݣ��Ա������������ƣ�Ȼ�󱣴���ʵ�������С�һ������execute()����������ݶ����Ϊ�����ߣ������������
	 * @param light
	 */
	public LightCommand(Light light) {
		this.light = light;
	}

	/**
	 * ���execute()����������ý��ն���
	 */
	@Override
	public void execute() {
		light.on();
	}

}
