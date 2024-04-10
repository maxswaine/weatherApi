package com.maxswaine.weathercli.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Current {
    private long last_updated_epoch;
    private String last_updated;
    private double temp_c;
    private int is_day;
    private Condition condition;
    private double wind_mph;
    private int humidity;
    private int cloud;
    private double feelslike_c;
    private double uv;
    private double gust_mph;

    @Override
    public String toString() {
        return "Current{" +
                "last_updated_epoch=" + last_updated_epoch +
                ", last_updated='" + last_updated + '\'' +
                ", temp_c=" + temp_c +
                ", is_day=" + is_day +
                ", condition=" + condition +
                ", wind_mph=" + wind_mph +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelslike_c=" + feelslike_c +
                ", uv=" + uv +
                ", gust_mph=" + gust_mph +
                '}';
    }
}
