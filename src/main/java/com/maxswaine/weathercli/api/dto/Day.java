package com.maxswaine.weathercli.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Day {
    private double maxtemp_c;
    private double mintemp_c;
    private double avgtemp_c;
    private double maxwind_mph;
    private double totalsnow_cm;
    private int daily_will_it_rain;
    private int daily_will_it_snow;
    private Condition condition;
    private double uv;

    @Override
    public String toString() {
        return "Day{" +
                "maxtemp_c=" + maxtemp_c +
                ", mintemp_c=" + mintemp_c +
                ", avgtemp_c=" + avgtemp_c +
                ", maxwind_mph=" + maxwind_mph +
                ", totalsnow_cm=" + totalsnow_cm +
                ", daily_will_it_rain=" + daily_will_it_rain +
                ", daily_will_it_snow=" + daily_will_it_snow +
                ", condition=" + condition +
                ", uv=" + uv +
                '}';
    }
}
