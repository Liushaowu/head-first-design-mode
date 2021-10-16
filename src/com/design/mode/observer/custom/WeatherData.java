package com.design.mode.observer.custom;

import com.design.mode.observer.custom.ObServer;
import com.design.mode.observer.custom.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DavidLiu
 */
public class WeatherData implements Subject {
    private List<ObServer> obServers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public WeatherData() {
        obServers = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObServer obServer) {
        obServers.add(obServer);
    }

    @Override
    public void removeObserver(ObServer obServer) {
        int i = obServers.indexOf(obServer);
        if (i >= 0) {
            obServers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (ObServer obServer : obServers) {
            obServer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
