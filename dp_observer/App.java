package dp_observer;

import dp_observer.observable.CricketObservable;
import dp_observer.observable.WeatherObservable;
import dp_observer.observer.MobileObserver;
import dp_observer.observer.TelevisionObserver;

public class App {
    public static void main(String[] args) {
        WeatherObservable wo = new WeatherObservable();
        CricketObservable co = new CricketObservable();

        MobileObserver m1 = new MobileObserver("M1");
        MobileObserver m2 = new MobileObserver("M2");

        TelevisionObserver t1 = new TelevisionObserver("T1");
        TelevisionObserver t2 = new TelevisionObserver("T2");

        wo.addObserver(m1);
        wo.addObserver(m2);
        wo.addObserver(t1);

        co.addObserver(t1);
        co.addObserver(t2);
        co.addObserver(m1);

        co.setData("22");
        wo.setData("27");
    }
}
