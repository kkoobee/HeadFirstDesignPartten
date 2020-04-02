package capter02.c1.display;

import capter02.c1.displayElement.DisplayElement;
import capter02.c1.observer.Observer;
import capter02.c1.subject.Subject;

public class ForecastDisplay implements Observer,DisplayElement{
    
	private Subject weatherData;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("forcecast temperature:"+temperature+" humidity:"+humidity+" pressure:"+pressure);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
