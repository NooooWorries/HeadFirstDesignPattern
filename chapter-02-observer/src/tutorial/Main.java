package tutorial;

import tutorial.display.CurrentConditionsDisplay;
import tutorial.display.ForecastDisplay;
import tutorial.observable.WeatherDataObservable;

public class Main {
    public static void main(String[] args) {
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherDataObservable);
        weatherDataObservable.setMeasurement(30f, 80f, 30f);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherDataObservable);
        weatherDataObservable.setMeasurement(30f, 80f, 30f);
    }
}
