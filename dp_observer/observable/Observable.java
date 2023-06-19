package dp_observer.observable;

import dp_observer.observer.Observer;

public interface Observable {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyAllObservers();

    public void setData(String data);

    public String getData();
}
