package capter02.c1.subject;

import java.util.ArrayList;
import java.util.List;

import capter02.c1.observer.Observer;

/**
 * �۲������ģʽ����������
 * @author xuchuanliangbt
 *
 */
public class WeatherData implements Subject{
	
	/**
	 * ��ע��Ĺ۲���
	 */
	private List<Observer> observers;
	
	/**
	 * �¶�
	 */
	private float temperature;
	
	/**
	 * ʪ��
	 */
	private float humidity;
	
	/**
	 * ѹ��
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
	 * �������ݷ���
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	/**
	 * ���û�������
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
