package test.observer;

/**
 * 所有的观察者都必须实现该接口
 * @author Administrator
 *
 */
public interface Observer {
	/* 所有的观察者都必须实现update()方法 */
	public void update(float temp, float humidity, float pressure);

}
