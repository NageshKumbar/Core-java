package com.xworkz.internal;

public class SmartSmartRemote extends SmartRemote{
    public SmartSmartRemote(){
        System.out.println("Running the SmartSmartRemote const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart method in the subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in the subclass");
    }
}
