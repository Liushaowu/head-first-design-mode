package com.design.mode.observer.custom;

/**
 * @author DavidLiu
 */
public class ForecastDisplay implements ObServer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: "+temperature +"F degrees and "+humidity+"% humidity");
    }
}
