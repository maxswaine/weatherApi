package com.maxswaine.weathercli.util;

import java.util.List;

public class CommandRunner {
    public static final List<String> endpointOptions = List.of("Current weather", "Forecast", "Sports");

    public static void provideOptions(){
        System.out.println("Pick an option");
        for (int i = 0; i < endpointOptions.size(); i++) {
            int optionNumber = i+1;
            System.out.println(optionNumber + ". " + endpointOptions.get(i));
        }
    }
}
