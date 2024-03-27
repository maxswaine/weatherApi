package com.maxswaine.weathercli.model;

public class WeatherRequest {
    private final String baseUri = "http://api.weatherapi.com/v1/";

    private String finalUri;
    private String q;
    private int days;
    private String date;

    public WeatherRequest(String q, int days, String date) {
        this.q = q;
        this.days = days;
        this.date = date;
    }

    public WeatherRequest(String q) {
        this.q = q;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
