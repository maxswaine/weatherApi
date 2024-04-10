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

    @Override
    public String toString() {
        return "Hour{" +
                "time_epoch=" + time_epoch +
                ", time='" + time + '\'' +
                ", temp_c=" + temp_c +
                ", is_day=" + is_day +
                ", condition=" + condition +
                ", wind_mph=" + wind_mph +
                ", snow_cm=" + snow_cm +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelslike_c=" + feelslike_c +
                ", windchill_c=" + windchill_c +
                ", will_it_rain=" + will_it_rain +
                ", chance_of_rain=" + chance_of_rain +
                ", will_it_snow=" + will_it_snow +
                ", chance_of_snow=" + chance_of_snow +
                ", gust_mph=" + gust_mph +
                ", uv=" + uv +
                '}';
    }
}
