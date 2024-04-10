package com.maxswaine.weathercli.model;

import com.maxswaine.weathercli.api.dto.Current;
import com.maxswaine.weathercli.api.dto.Location;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentWeatherResponse {
    private Location location;
    private Current current;

    @Override
    public String toString() {
        return "CurrentWeatherResponse{" +
                "location:" + location +
                ", current=" + current +
                '}';
    }
}
