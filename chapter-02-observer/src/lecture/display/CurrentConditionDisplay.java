package lecture.display;

import lecture.observer.Observer;
import lecture.subject.Subject;

public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Subject weatherData; // In case we need to cancel in the future

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " Celsius Degree and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
