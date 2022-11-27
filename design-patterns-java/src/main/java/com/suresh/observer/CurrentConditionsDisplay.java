package com.suresh.observer;

/*
 * This display implements Observer interface so that it can get changes from WeatherData object
 * It implements DisplayElement because our API will require all display elements to implement this interface
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    /*
     * The constructor is passed the weatherData object(the subject)
     * and we use it to register the display as an observer
     */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + " % humidity");
    }

}
