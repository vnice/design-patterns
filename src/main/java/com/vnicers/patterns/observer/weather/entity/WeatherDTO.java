package com.vnicers.patterns.observer.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDTO {

    private float temperature;

    private float humidity;

    private float pressure;

}
