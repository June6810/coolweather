package com.example.test.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangcehua on 2017/6/15.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
