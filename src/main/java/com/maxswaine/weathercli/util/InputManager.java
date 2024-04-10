package com.maxswaine.weathercli.util;

import com.maxswaine.weathercli.enums.Endpoints;

import java.util.Scanner;

public class InputManager {

    Scanner scanner = new Scanner(System.in);

    public String getLocationFromUser() {
        System.out.println("Where would you like to get the weather of");
        return scanner.next();

    }

    public int getForecastDaysFromUser(){
        System.out.println("Type how many days you would like to get a weather forecast");
        return scanner.nextInt();

    }

    public Endpoints getEndpointFromUser() {
        CommandRunner.provideOptions();

        int endpointOption = scanner.nextInt();
        Endpoints endpoint;
        switch (endpointOption) {
            case 1 -> endpoint = Endpoints.CURRENT;
            case 2 -> endpoint = Endpoints.FORECAST;
            case 3 -> endpoint = Endpoints.SPORTS;
            default -> {
                System.out.println("Invalid Option");
                endpoint = Endpoints.CURRENT;
            }
        }
        return endpoint;

    }

}

