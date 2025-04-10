package com.xworkz.internal;

public class SmartElectricKettle extends ElectricKettle{
    public SmartElectricKettle(){
        System.out.println("Running the SmartElectricKettle const");
    }
    @Override
    public void usekettle(){
        System.out.println("Running the usekettle method in the subclass");
    }
    public void mainkettle(){
        System.out.println("Running the mainkettle method in the subclass");
    }
}
