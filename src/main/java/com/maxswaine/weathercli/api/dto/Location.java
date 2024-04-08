package com.maxswaine.weathercli.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private String name;
    private String region;
    private String country;
    private long lat;
    private long lon;
    private String tz_id;
    private double localtime_epoch;
    private String localtime;
}
