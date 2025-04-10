package com.xworkz.internal;

public class SmartSmartTowel extends SmartTowel {
    public SmartSmartTowel(){
        System.out.println("Running the SmartSmartTowel const");
    }
    @Override
    public void usetowel(){
        System.out.println("Running the overrided usetowel method in the subclasss");
    }
    public void maintowel(){
        System.out.println("Running the maintowel method in the subclass");
    }
}
