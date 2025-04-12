package com.ironhack.lab_java_springboot_fundamentals_es.model;

public class Weather {

    private int temperature;
    private String condition;
    private int windSpeed;

    public Weather(int temperature, String condition, int windSpeed) {
        this.temperature = temperature;
        this.condition = condition;
        this.windSpeed = windSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
}
