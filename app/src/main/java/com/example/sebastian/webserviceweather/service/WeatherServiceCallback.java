package com.example.sebastian.webserviceweather.service;

import com.example.sebastian.webserviceweather.data.Channel;

/**
 * Created by Sebastian on 12.01.2018.
 */

public interface WeatherServiceCallback {

    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);

}
