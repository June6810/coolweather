package com.example.test.weatherapp.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yangcehua on 2017/6/13.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
