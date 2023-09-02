package tutorial.display;

import tutorial.observable.WeatherDataObservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Display {

    Observable observable;
    private float currentPressure = 29.22f;
    private float lastPressure;


    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherDataObservable) {
            WeatherDataObservable weatherDataObservable = (WeatherDataObservable) observable;
            lastPressure = currentPressure;
            currentPressure = weatherDataObservable.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current pressure " + currentPressure + " and last pressure " + lastPressure);
    }
}
