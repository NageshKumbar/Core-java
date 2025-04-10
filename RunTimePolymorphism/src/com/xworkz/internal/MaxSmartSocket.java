package com.xworkz.internal;

public class MaxSmartSocket extends SmartSocket{
    public MaxSmartSocket(){
        System.out.println("Running the MaxSmartSocket const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart in the subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart in the subclass");
    }
}
