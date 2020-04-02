package capter02.c2.display;

import java.util.Observable;
import java.util.Observer;

import capter02.c2.displayElement.DisplayElement;
import capter02.c2.subject.WeatherData;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	
	private Observable observable;
	
	private float temperature;
	
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
