package com.example.test.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangcehua on 2017/6/14.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public  String info;
    }
}
