package com.xworkz.internal;

public class ProSmartLamp extends SmartLamp{
    public  ProSmartLamp(){
        System.out.println("Running the ProSmartLamp const");
    }
    @Override
    public void uselamp(){
        System.out.println("Running the overrided uselamp method in the subclass");
    }
    public void mainlamp(){
        System.out.println("Running the mainlamp method in the subclass");
    }
}
