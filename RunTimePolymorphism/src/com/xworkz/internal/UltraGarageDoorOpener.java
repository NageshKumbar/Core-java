package com.xworkz.internal;

public class UltraGarageDoorOpener extends GarageDoorOpener{
    public UltraGarageDoorOpener(){
        System.out.println("Running the UltraGarageDoorOpener const");
    }
    @Override
    public void usegarage(){
        System.out.println("Running the usegarage method in subclass");
    }
    public void maingarage(){
        System.out.println("Runnig the maingarage method in subclass");
    }
}
