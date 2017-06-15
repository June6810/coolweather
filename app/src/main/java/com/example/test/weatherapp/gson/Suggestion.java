package com.example.test.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangcehua on 2017/6/15.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort confort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
