package test.observer;

import java.util.ArrayList;

/**
 * 天气数据类，此类实现Subject接口
 * @author Administrator
 *
 */
public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}

	/* 注册观察者 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/* 取消观察者 */
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i > 0) {
			observers.remove(i);
		}
	}

	/* 通知观察者 */
	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
