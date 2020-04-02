package capter02.c2.test;

import capter02.c2.display.*;
import capter02.c2.subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay c = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(12, 12, 12);
		weatherData.measurementsChanged();
	}
}
