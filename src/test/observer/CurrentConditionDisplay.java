package test.observer;

/**
 * 公告板对象
 * @author Administrator
 *
 */
public class CurrentConditionDisplay implements Observer {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		System.out.println("Current conditions: temperature " + temperature + ", " + "humidity " + humidity);
	}
}
