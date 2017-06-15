package com.example.test.weatherapp.gson;

/**
 * Created by yangcehua on 2017/6/14.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
