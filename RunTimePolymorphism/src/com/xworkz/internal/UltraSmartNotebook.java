package com.xworkz.internal;

public class UltraSmartNotebook extends SmartNotebook{
    public UltraSmartNotebook(){
        System.out.println("Running the UltraSmartNotebook const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart method in the subclass");


    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in the subclass");
    }
}
