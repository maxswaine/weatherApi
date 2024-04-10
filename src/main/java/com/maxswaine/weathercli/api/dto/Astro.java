package com.maxswaine.weathercli.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Astro {
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moon_phase;
    private int moon_illumination;
    private int is_moon_up;
    private int is_sun_up;

    @Override
    public String toString() {
        return "Astro{" +
                "sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", moonrise='" + moonrise + '\'' +
                ", moonset='" + moonset + '\'' +
                ", moon_phase='" + moon_phase + '\'' +
                ", moon_illumination=" + moon_illumination +
                ", is_moon_up=" + is_moon_up +
                ", is_sun_up=" + is_sun_up +
                '}';
    }
}
