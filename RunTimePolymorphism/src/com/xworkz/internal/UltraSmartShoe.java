package com.xworkz.internal;

public class UltraSmartShoe extends SmartShoe{
    public void UltraSmartShoe(){
        System.out.println("Running the UltraSmartShoe const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the overrided usesmart method in the subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in the subclass");
    }
}
