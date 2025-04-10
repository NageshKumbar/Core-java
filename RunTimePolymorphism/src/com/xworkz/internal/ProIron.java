package com.xworkz.internal;

public class ProIron extends  Iron{
    public ProIron(){
        System.out.println("Running the ProIron const");
    }
    @Override
    public void useiron(){
        System.out.println("Running the useiron method in the subclass");
    }
    public void mainiron(){
        System.out.println("Running the mainiron method in the subclass");
    }
}
