package lecture;

import lecture.display.CurrentConditionDisplay;
import lecture.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurement(30f, 55f, 30f);
    }
}
