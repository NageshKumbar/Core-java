package com.xworkz.internal;

public class ProSmartThermostat extends SmartThermostat{
    public ProSmartThermostat(){
        System.out.println("Running the ProSmartThermostat const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart method in subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in subclass");
    }
}
