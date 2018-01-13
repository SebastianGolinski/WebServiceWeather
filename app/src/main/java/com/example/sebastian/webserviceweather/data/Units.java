package com.example.sebastian.webserviceweather.data;

/**
 * Created by Sebastian on 12.01.2018.
 */

import org.json.JSONObject;

public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
