package com.xworkz.internal;

public class Weather {
    final String condition;
    final String season;
    public Weather(String condition, String season) {
        this.condition = condition;
        this.season = season;
    }
    @Override public String toString() {
        return "Weather [condition=" + condition + ", season=" + season + "]";
    }
}