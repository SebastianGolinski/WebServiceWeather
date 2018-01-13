package com.example.sebastian.webserviceweather.data;

/**
 * Created by Sebastian on 12.01.2018.
 */

import org.json.JSONObject;

public class Condition implements JSONPopulator {
    private int code;
    private int temperature;
    private String description;

    public int getCode() {
        return code;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void populate(JSONObject data) {
        code = data.optInt("code");
        temperature = data.optInt("temp");
        description = data.optString("text");
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }

}
