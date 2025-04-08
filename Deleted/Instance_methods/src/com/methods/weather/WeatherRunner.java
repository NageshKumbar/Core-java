package com.methods.weather;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Seasons seasons = new Seasons(weather);
        seasons.rainWater();
    }
}