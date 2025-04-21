package com.xworkz.internal;

public abstract class Appliances {
    public abstract void fridge();
    public abstract void washingMachine();
    public void microwaveOven(){
        System.out.println("Running microwave oven in Appliances");
    }
    public void television(){
        System.out.println("Running television in Appliances");
    }
}