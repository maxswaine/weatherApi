package com.maxswaine.weathercli.api;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Date;

public class WeatherRequest {
    private final String apiKey = "d5399f18371a49b8878153735241903";
    private String q;
    private int days;
    private String date;

    HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI(""))
    public WeatherRequest(String q, int days, String date) {
        this.q = q;
        this.days = days;
        this.date = date;
    }
}
