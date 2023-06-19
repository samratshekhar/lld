package dp_observer.observable;

import java.util.ArrayList;
import java.util.List;

import dp_observer.observer.Observer;

public class CricketObservable implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private Integer currentRun = 0;

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.size() > 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void setData(String data) {
        Integer newRun = Integer.parseInt(data);
        if (currentRun != newRun) {
            currentRun = newRun;
            notifyAllObservers();
        }
    }

    @Override
    public String getData() {
        return "Current run is: " + currentRun.toString();
    }
}
