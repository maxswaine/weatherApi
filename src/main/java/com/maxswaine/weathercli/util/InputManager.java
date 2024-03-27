package com.maxswaine.weathercli.util;

import com.maxswaine.weathercli.enums.Endpoints;

import java.util.List;
import java.util.Scanner;

public class InputManager {

    Scanner scanner = new Scanner(System.in);

    public String getLocationFromUser() {
        return scanner.next();

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

