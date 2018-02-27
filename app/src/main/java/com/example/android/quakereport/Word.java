package com.example.android.quakereport;

/**
 * Created by RajPrabhakar on 27-02-2018.
 */

public class Word {

    private String qMagnitude, qLocation, qDate;

    public Word(String magnitude, String location, String date) {
        qMagnitude = magnitude;
        qLocation = location;
        qDate = date;
    }

    public String getqMagnitude() {
        return qMagnitude;
    }

    public String getqLocation() {
        return qLocation;
    }

    public String getqDate() {
        return qDate;
    }

}
