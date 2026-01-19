package com.artexpo;
public class Artist {

    private String name;
    private int hour;
    private int minute;

    public Artist(String name, int hour, int minute) {
        this.name = name;
        this.hour = hour;
        this.minute = minute;
    }

    public String getName() {
        return name;
    }

    // Convert time to total minutes for comparison
    public int getTotalMinutes() {
        return hour * 60 + minute;
    }

    public String getTime() {
        return hour + ":" + (minute < 10 ? "0" + minute : minute);
    }
}
