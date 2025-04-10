package com.xworkz.internal;

public class SmartPortableAC extends PortableAC{
    public SmartPortableAC(){
        System.out.println("Running the SmartPortableAC const");
    }
    @Override
    public void useportable(){
        System.out.println("Running the useportable method in the subclass");
    }
    public void mainportable(){
        System.out.println("Running the mainportble method in the subclass");
    }
}
