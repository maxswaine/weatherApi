package com.maxswaine.weathercli;

import com.google.gson.Gson;
import com.maxswaine.weathercli.enums.Endpoints;
import com.maxswaine.weathercli.model.CurrentWeatherResponse;
import com.maxswaine.weathercli.model.WeatherAPIRequestBuilder;
import com.maxswaine.weathercli.util.InputManager;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.maxswaine.weathercli.config.config.API_KEY;

public class WeatherCli {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        InputManager inputManager = new InputManager();
        WeatherAPIRequestBuilder weatherAPIRequestBuilder = new WeatherAPIRequestBuilder(API_KEY);
        Gson gson = new Gson();
        int days = 0;


        Endpoints endpoint = inputManager.getEndpointFromUser();
        String location = inputManager.getLocationFromUser();

        if (endpoint == Endpoints.FORECAST){
            days = inputManager.getForecastDaysFromUser();
        }

        URI getRequest = weatherAPIRequestBuilder.buildRequest(endpoint, location, days);

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(getRequest)
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        CurrentWeatherResponse currentWeatherResponse = gson.fromJson(response.body(), CurrentWeatherResponse.class);


        System.out.println(response.statusCode());
        System.out.println(response.body());
        System.out.println(currentWeatherResponse.getCurrent().getFeelslike_c());




    }
}
