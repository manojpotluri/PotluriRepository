package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	public void attach(Observer e) {
		observers.add(e);
	}
	
	public void notifyAllObservers() {
		for(Observer e: observers)
			e.update();
	}
}
