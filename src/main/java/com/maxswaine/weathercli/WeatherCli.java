package com.maxswaine.weathercli;

import com.maxswaine.weathercli.enums.Endpoints;
import com.maxswaine.weathercli.model.WeatherRequest;
import com.maxswaine.weathercli.util.InputManager;

public class WeatherCli {
    public static void main(String[] args) {

        InputManager inputManager = new InputManager();


        Endpoints endpoint = inputManager.getEndpointFromUser();
        String location = inputManager.getLocationFromUser();
        WeatherRequest weatherRequest = new WeatherRequest(location);

        String postUrl = weatherRequest.getBaseUri() + endpoint.getPath() + location;

        System.out.println(postUrl);





    }
}
