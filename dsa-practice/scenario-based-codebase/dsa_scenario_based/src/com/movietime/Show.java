package com.movietime;
public class Show {

    private String movieName;
    private int hour;
    private int minute;

    public Show(String movieName, int hour, int minute) {
        this.movieName = movieName;
        this.hour = hour;
        this.minute = minute;
    }

    public String getMovieName() {
        return movieName;
    }

    // Used for sorting
    public int getTotalMinutes() {
        return hour * 60 + minute;
    }

    public String getShowTime() {
        return hour + ":" + (minute < 10 ? "0" + minute : minute);
    }
}
