package com.maxswaine.weathercli.enums;

public enum Endpoints {
    CURRENT("current.json"),
    FORECAST("forecast.json"),
    SPORTS("sports.json");

    private final String path;

    Endpoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
