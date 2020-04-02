package capter06.c2;

/**
 * 音响
 * @author xuchuanliangbt
 *
 */
public class Stere {
	
	public void on() {
		System.out.println("打开音响，音乐很不错");
	}
	
	public void setCD() {
		System.out.println("设置CD，播放《断桥残雪》");
	}
	
	public void setVoice(int voice) {
		System.out.println("设置音量是:"+voice);
	}
	
	public void off() {
		System.out.println("关闭音响，好安静");
	}
}
