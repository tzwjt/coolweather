package com.coolweather.android.gson;

/**
 * Created by jhon on 2017-04-20.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
