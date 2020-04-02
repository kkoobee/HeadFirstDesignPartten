package capter02.c2.subject;

import java.util.Observable;

public class WeatherData extends Observable{
	
	/**
	 * ÎÂ¶È
	 */
	private float temperature;
	
	/**
	 * Êª¶È
	 */
	private float humidity;
	
	/**
	 * Ñ¹Á¦
	 */
	private float pressure;
	
	public WeatherData() {}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	
}
