package tutorial.observable;

import lecture.subject.WeatherData;

import java.util.Observable;

public class WeatherDataObservable extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataObservable() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
