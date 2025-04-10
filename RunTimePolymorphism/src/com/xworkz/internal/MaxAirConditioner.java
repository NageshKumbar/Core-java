package com.xworkz.internal;

public class MaxAirConditioner extends AirConditioner{
    public MaxAirConditioner(){
        System.out.println("Running MaxAirConditioner const");

    }
    @Override
    public void useaircondtioner(){
        System.out.println("Running overrided useaircondtioner from Maxcondtioner subclass and parent class is Aircondtioiner ");
    }
    public void maintianairconditioner(){
        System.out.println("Running maintianairconditioner method in subclass Maxconditoner");
    }
}
