package com.xworkz.internal;

public class ProWeatherStation extends WeatherStation{
    public ProWeatherStation(){
        System.out.println("Running the ProWeatherStation const");
    }
    @Override
    public void useweather(){
        System.out.println("Running the useweather in the subclass");
    }
    public void mainweather(){
        System.out.println("Running the mainweather in the subclass");
    }
}
