package com.xworkz.internal;

public class EliteSmartWatch extends SmartWatch{
    public EliteSmartWatch(){
        System.out.println("Running eliteSmartWatch const");
    }
    @Override
    public void usesmartwatch(){
        System.out.println("Running usesmartwatch method in subclass");
    }
    public void mainsmartwatch(){
        System.out.println("Running mainsmartwatch method in subclass ");
    }
}
