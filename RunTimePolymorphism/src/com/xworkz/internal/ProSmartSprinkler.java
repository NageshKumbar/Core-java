package com.xworkz.internal;

public class ProSmartSprinkler extends SmartSprinkler{
    public ProSmartSprinkler(){
        System.out.println("Running the ProSmartSprinkler const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart in the subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart in the subclass");
    }
}
