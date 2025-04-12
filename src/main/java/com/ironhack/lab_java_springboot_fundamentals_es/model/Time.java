package com.ironhack.lab_java_springboot_fundamentals_es.model;

public class Time {

    private String time;
    private String date;
    private String day;

    public Time(String time, String date, String day) {
        this.time = time;
        this.date = date;
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
