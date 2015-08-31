package test.observer;

/**
 * 公告板对象
 * @author Administrator
 *
 */
public class StatisticsDisplay implements Observer {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		System.out.println("Statistics conditions: temperature " + temperature + ", " + "humidity " + humidity);
	}

}
