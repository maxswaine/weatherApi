package com.maxswaine.weathercli.api;

    public class WeatherResponse {
        private final String lastUpdated;
        private final int lastUpdatedEpoch;
        private final double tempC;
        private final double tempF;
        private final double feelsLikeC;
        private final double feelsLikeF;
        private final String conditionText;
        private final String conditionIcon;
        private final int conditionCode;
        private final double windMph;
        private final double windKph;
        private final int windDegree;
        private final String windDir;
        private final double pressureMb;
        private final double pressureIn;
        private final double precipMm;
        private final double precipIn;
        private final int humidity;
        private final int cloud;
        private final int isDay;
        private final double uv;
        private final double gustMph;
        private final double gustKph;

        public WeatherResponse(String lastUpdated, int lastUpdatedEpoch, double tempC, double tempF, double feelsLikeC, double feelsLikeF, String conditionText, String conditionIcon, int conditionCode, double windMph, double windKph, int windDegree, String windDir, double pressureMb, double pressureIn, double precipMm, double precipIn, int humidity, int cloud, int isDay, double uv, double gustMph, double gustKph) {
            this.lastUpdated = lastUpdated;
            this.lastUpdatedEpoch = lastUpdatedEpoch;
            this.tempC = tempC;
            this.tempF = tempF;
            this.feelsLikeC = feelsLikeC;
            this.feelsLikeF = feelsLikeF;
            this.conditionText = conditionText;
            this.conditionIcon = conditionIcon;
            this.conditionCode = conditionCode;
            this.windMph = windMph;
            this.windKph = windKph;
            this.windDegree = windDegree;
            this.windDir = windDir;
            this.pressureMb = pressureMb;
            this.pressureIn = pressureIn;
            this.precipMm = precipMm;
            this.precipIn = precipIn;
            this.humidity = humidity;
            this.cloud = cloud;
            this.isDay = isDay;
            this.uv = uv;
            this.gustMph = gustMph;
            this.gustKph = gustKph;
        }
    }
