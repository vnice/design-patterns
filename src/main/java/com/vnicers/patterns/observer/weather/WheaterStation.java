package com.vnicers.patterns.observer.weather;

import com.vnicers.patterns.observer.weather.entity.WeatherDTO;

public class WheaterStation {
    public static void main(String[] args) {
        WeatherSubject weatherSubject=new WeatherSubject();
        CurrentConditionDisplay display=new CurrentConditionDisplay(weatherSubject);
        weatherSubject.setWeatherDTO(new WeatherDTO(80,65,30.4f));
    }
}
