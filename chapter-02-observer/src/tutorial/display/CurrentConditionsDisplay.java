package tutorial.display;


import tutorial.observable.WeatherDataObservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Display {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherDataObservable) {
            WeatherDataObservable weatherDataObservable = (WeatherDataObservable) observable;
            this.temperature = weatherDataObservable.getTemperature();
            this.humidity = weatherDataObservable.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " Celsius Degree and " + humidity + "% humidity");
    }
}
