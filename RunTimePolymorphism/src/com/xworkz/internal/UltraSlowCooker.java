package com.xworkz.internal;

public class UltraSlowCooker extends SlowCooker{
    public UltraSlowCooker(){
        System.out.println("Running the UltraSlowCooker const");
    }
    @Override
    public void usecook(){
        System.out.println("Running the usecook method in the subclass");

    }
    public void maincook(){
        System.out.println("Running the maincook method in the subclass");
    }
}
