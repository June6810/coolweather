package com.example.test.weatherapp.util;

import android.text.TextUtils;

import com.example.test.weatherapp.db.City;
import com.example.test.weatherapp.db.Country;
import com.example.test.weatherapp.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by yangcehua on 2017/6/13.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response) {
        if (TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i <allProvinces.length();++i) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.optString("name"));
                    province.setProvinceCode(provinceObject.optInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponse(String response,int provinceId){
        if (TextUtils.isEmpty(response)){
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i<allCities.length();++i){
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.optString("name"));
                    city.setCityCode(cityObject.optInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountryResponse(String response,int cityId){
        if (TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i<allCounties.length();++i){
                    JSONObject countryObject = allCounties.getJSONObject(i);
                    Country country = new Country();
                    country.setCountyName(countryObject.optString("name"));
                    country.setWeatherId(countryObject.optString("weather_id"));
                    country.setCityId(cityId);
                    country.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
