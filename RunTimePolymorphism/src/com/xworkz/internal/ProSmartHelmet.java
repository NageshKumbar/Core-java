package com.xworkz.internal;

public class ProSmartHelmet extends SmartHelmet {
    public ProSmartHelmet(){
        System.out.println("Running the ProSmartHelmet const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart method in subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in subclass");
    }
}
