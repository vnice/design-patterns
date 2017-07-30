package com.vnicers.patterns.observer.weather;

import com.vnicers.patterns.observer.weather.entity.WeatherDTO;

import java.util.Observable;

public class WeatherSubject extends Observable {
    private WeatherDTO weatherDTO;

    public void setWeatherDTO(WeatherDTO weatherDTO) {
        this.weatherDTO = weatherDTO;
        setChanged();
        notifyObservers();
    }

    public WeatherDTO getWeatherDTO() {
        return weatherDTO;
    }
}
