package com.xworkz.internal;

public class EliteSmartCurtain extends  SmartCurtain{
    public EliteSmartCurtain(){
        System.out.println("Running the EliteSmartCurtain const");

    }
    @Override
    public void usesmart(){
        System.out.println("Running the usesmart method in the subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in the subclass");
    }

}
