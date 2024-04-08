package com.maxswaine.weathercli.model;

import com.maxswaine.weathercli.api.dto.Forecast;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForecastWeatherResponse extends CurrentWeatherResponse {
    private Forecast forecast;
}


