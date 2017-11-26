package com.mokeweather.android.gson;

/**
 * Created by Administrator on 2017/11/26 0026.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
