package dp_observer.observer;

import dp_observer.observable.Observable;

public class MobileObserver implements Observer {

    private String mobileId;

    public MobileObserver(String mobileId) {
        this.mobileId = mobileId;
    }

    @Override
    public void update(Observable observable) {
        System.out.println("Mobile observer update -> mobileId: " + mobileId + " value: " + observable.getData());
    }

}
