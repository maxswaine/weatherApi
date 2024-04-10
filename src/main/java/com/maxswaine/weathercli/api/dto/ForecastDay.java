package com.maxswaine.weathercli.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ForecastDay {
    private String date;
    private long date_epoch;
    private Day day;
    private Astro astro;
    private List<Hour> hour;

    @Override
    public String toString() {
        return "ForecastDay{" +
                "date='" + date + '\'' +
                ", date_epoch=" + date_epoch +
                ", day=" + day +
                ", astro=" + astro +
                ", hour=" + hour +
                '}';
    }
}
