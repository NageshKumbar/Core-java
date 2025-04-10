package com.xworkz.internal;

public class MaxSmartFaucet extends  SmartFaucet{
    public MaxSmartFaucet(){
        System.out.println("Running the MaxSmartFaucet const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart method in subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in the subclass");
    }
}
