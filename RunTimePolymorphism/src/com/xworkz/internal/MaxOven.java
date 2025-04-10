package com.xworkz.internal;

public class MaxOven extends Oven{
    public MaxOven(){
        System.out.println("Running the MaxOven const");
    }
    @Override
    public void useoven(){
        System.out.println("Runnin overrided useoven method in the subclass");
    }
    public void mainoven(){
        System.out.println("Running the mainoven method in the subclass ");
    }
}
