package test.observer;

/**
 * 主题接口，对象使用该接口注册为观察者，或者把自己从观察者中移除
 * @author Administrator
 *
 */
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();

}
