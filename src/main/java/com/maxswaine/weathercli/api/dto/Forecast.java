package com.maxswaine.weathercli.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Forecast {
    private List<ForecastDay> forecastDay;

    @Override
    public String toString() {
        return "Forecast{" +
                "forecastDay=" + forecastDay +
                '}';
    }
}
