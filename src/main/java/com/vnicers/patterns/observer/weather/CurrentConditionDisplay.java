package com.vnicers.patterns.observer.weather;

import com.vnicers.patterns.observer.weather.entity.WeatherDTO;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;


@Slf4j
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private WeatherDTO weatherDTO;

    public CurrentConditionDisplay(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void display() {
        log.info("Current conditions: Temperature:{},Humidity:{}",
                weatherDTO.getTemperature(), weatherDTO.getHumidity());
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherSubject) {
            WeatherSubject weatherSubject = (WeatherSubject) o;
            this.weatherDTO=weatherSubject.getWeatherDTO();
            this.display();
        }
    }
}
