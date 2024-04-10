package com.maxswaine.weathercli.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String tz_id;
    private double localtime_epoch;
    private String localtime;

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", tz_id='" + tz_id + '\'' +
                ", localtime_epoch=" + localtime_epoch +
                ", localtime='" + localtime + '\'' +
                '}';
    }
}
