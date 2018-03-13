package com.example.android.quakereport;

/**
 * Created by RajPrabhakar on 27-02-2018.
 */

public class Word {

    private String qLocation, qUrl;
    private long qMilliSeconds;
    private double qMagnitude;

    public Word(double magnitude, String location, long milliseconds, String url) {
        qMagnitude = magnitude;
        qLocation = location;
        qMilliSeconds = milliseconds;
        qUrl = url;
    }

    public double getqMagnitude() {
        return qMagnitude;
    }

    public String getqLocation() {
        return qLocation;
    }

    public long getqMilliSeconds() {
        return qMilliSeconds;
    }

    public String getqUrl() {
        return qUrl;
    }

}
