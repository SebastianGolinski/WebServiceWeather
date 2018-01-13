package com.example.sebastian.webserviceweather.data;

/**
 * Created by Sebastian on 12.01.2018.
 */

import org.json.JSONObject;

public interface JSONPopulator {
    void populate(JSONObject data);

    JSONObject toJSON();
}