package capter02.c1.display;

import capter02.c1.displayElement.DisplayElement;
import capter02.c1.observer.Observer;
import capter02.c1.subject.Subject;

/**
 * 目前状况布告栏
 * @author xuchuanliangbt
 *
 */
public class CurrentConditionsDisplay implements DisplayElement,Observer{

	private float temperature;
	
	private float humidity;
	
	private Subject weatherData;
	
	/**
	 * 构造器传入需要注册的主题，并且注册当前对象
	 * @param weatherData
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
		
	}

	@Override
	public void display() {
		System.out.println("current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
		
	}
	
}
