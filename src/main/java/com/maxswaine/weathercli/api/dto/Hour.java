package com.maxswaine.weathercli.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hour {
    private long time_epoch;
    private String time;
    private double temp_c;
    private int is_day;
    private Condition condition;
    private double wind_mph;
    private double snow_cm;
    private int humidity;
    private int cloud;
    private double feelslike_c;
    private double windchill_c;
    private int will_it_rain;
    private int chance_of_rain;
    private int will_it_snow;
    private int chance_of_snow;
    private double gust_mph;
    private double uv;
}
