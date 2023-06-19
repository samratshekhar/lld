package dp_observer.observer;

import dp_observer.observable.Observable;

public class TelevisionObserver implements Observer {

    private String telivisionId;

    public TelevisionObserver(String telivisionId) {
        this.telivisionId = telivisionId;
    }

    @Override
    public void update(Observable observable) {
        System.out.println(
                "Telivision observer update -> telivisionId: " + telivisionId + " value: " + observable.getData());
    }

}
