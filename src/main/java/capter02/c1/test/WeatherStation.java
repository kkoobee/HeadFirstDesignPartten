package capter02.c1.test;

import capter02.c1.display.CurrentConditionsDisplay;
import capter02.c1.display.ForecastDisplay;
import capter02.c1.display.StatisticsDisplay;
import capter02.c1.subject.WeatherData;

/**
 * ∆¯œÛ’æ≤‚ ‘¿‡
 * @author xuchuanliangbt
 *
 */
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(12, 13, 14);
		weatherData.setMeasurements(13, 14, 15);
		weatherData.setMeasurements(14, 15, 16);
		System.out.println("after remove");
		weatherData.removeObserver(conditionsDisplay);
		weatherData.removeObserver(forecastDisplay);
		weatherData.removeObserver(statisticsDisplay);
		weatherData.setMeasurements(12, 13, 14);
		weatherData.setMeasurements(13, 14, 15);
		weatherData.setMeasurements(14, 15, 16);
	}
}
