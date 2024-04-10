package com.maxswaine.weathercli.model;

import com.maxswaine.weathercli.enums.Endpoints;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class WeatherAPIRequestBuilder {
    private static final String BASE_URL = "https://api.weatherapi.com/v1/";

    private String apiKey;

    public WeatherAPIRequestBuilder(String apiKey) {
        this.apiKey = apiKey;
    }

    public URI buildRequest(Endpoints endpoint, String query, Integer days) throws URISyntaxException {
        String endpointPath = endpoint.getPath();
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("q", query);

        if (endpoint == Endpoints.FORECAST) {
            queryParams.put("days", String.valueOf(days));
        }

        return buildRequest(endpointPath, queryParams);
    }

    private URI buildRequest(String endpointPath, Map<String, String> queryParams) throws URISyntaxException {
        StringBuilder uriBuilder = new StringBuilder(BASE_URL).append(endpointPath).append("?");

        // Manually add key and apiKey parameters at the beginning
        uriBuilder.append("key=").append(apiKey).append("&");

        // Iterate over other query parameters
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            // Skip adding key and apiKey again
            if (!entry.getKey().equals("key")) {
                uriBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
        }
        uriBuilder.deleteCharAt(uriBuilder.length() - 1); // Remove the trailing "&"

        System.out.println(uriBuilder);
        return new URI(uriBuilder.toString());
    }
}
