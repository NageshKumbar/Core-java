package com.xworkz.internal;

public class SmartSmartMat extends SmartMat{
    public SmartSmartMat(){
        System.out.println("Running the SmartSmartMat const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart method in the subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in the subclass");
    }
}
