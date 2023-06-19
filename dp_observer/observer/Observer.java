package dp_observer.observer;

import dp_observer.observable.Observable;

public interface Observer {
    public void update(Observable observable);
}
