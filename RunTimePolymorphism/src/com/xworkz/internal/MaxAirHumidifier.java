package com.xworkz.internal;

public class MaxAirHumidifier extends AirHumidifier{
    public MaxAirHumidifier(){
        System.out.println("Running the MaxAirHumidifier const");
    }
    @Override
    public void useair(){
        System.out.println("Running the useair method in the subclass");
    }
    public void mainair(){
        System.out.println("Runnin the mainair method in the subclass");
    }
}
