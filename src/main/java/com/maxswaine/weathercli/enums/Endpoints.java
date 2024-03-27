package com.maxswaine.weathercli.enums;

public enum Endpoints {
    CURRENT("current.json?q="),
    FORECAST("forecast.json?q="),
    SPORTS("sports.json?q=");

    private final String path;

    Endpoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
