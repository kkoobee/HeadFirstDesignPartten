package capter02.c1.subject;

import java.util.ArrayList;
import java.util.List;

import capter02.c1.observer.Observer;

/**
 * 观察者设计模式：天气主题
 * @author xuchuanliangbt
 *
 */
public class WeatherData implements Subject{
	
	/**
	 * 已注册的观察者
	 */
	private List<Observer> observers;
	
	/**
	 * 温度
	 */
	private float temperature;
	
	/**
	 * 湿度
	 */
	private float humidity;
	
	/**
	 * 压力
	 */
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index!=-1) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++) {
			observers.get(i).update(temperature, humidity, pressure);
		}
	}
	
	/**
	 * 更新数据方法
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	/**
	 * 设置基础数据
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
}
