package com.xworkz.internal;

public class EliteHeater extends Heater{
    public EliteHeater(){
        System.out.println("Running the EliteHeater const");
    }
    @Override
    public void useheater(){
        System.out.println("Running the overrided useheater method in the subclass");
    }
    public void mainheater(){
        System.out.println("Running the mainheater nethod in the subclass");
    }
}
