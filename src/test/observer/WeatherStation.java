package test.observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 35.4f);
		weatherData.setMeasurements(86, 69, 38.f);
	}
}
