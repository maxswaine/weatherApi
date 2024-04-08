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
}
