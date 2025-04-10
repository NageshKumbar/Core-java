package com.xworkz.internal;

public class EliteAirFryer extends AirFryer{
    public EliteAirFryer(){
        System.out.println("Running the EliteAirFryer const");
    }
    @Override
    public void useair(){
        System.out.println("Running the useair method in the subclass");
    }
    public void mainair(){
        System.out.println("Running the mainair method in the subclass");
    }
}
