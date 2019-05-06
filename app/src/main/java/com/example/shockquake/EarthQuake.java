package com.example.shockquake;

import android.location.Location;

public class EarthQuake
{
    String location, date;
    Double magnitude;

    public EarthQuake(Double magnitude, String location, String date)
    {
        this.magnitude =magnitude;
        this.location = location;
        this.date = date;
    }


    public String getLocation()
    {
        return location;
    }

    public double getMagnitude()
    {
        return magnitude;
    }

    public String getDate()
    {
        return date;
    }
}
