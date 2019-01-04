package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Li on 2019/1/3.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String information;
    }
    public class CarWash{
        @SerializedName("txt")
        public String information;
    }
    public class Sport{
        @SerializedName("txt")
        public String information;
    }
}
