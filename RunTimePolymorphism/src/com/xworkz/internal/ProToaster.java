package com.xworkz.internal;

public class ProToaster extends Toaster{
    public ProToaster(){
        System.out.println("Running the ProToaster const");
    }
    @Override
    public void usetoaster(){
        System.out.println("Running the usetoster method in the subclass");
    }
    public void maintoster(){
        System.out.println("Running the maintoseter method in the subclass");
    }
}
