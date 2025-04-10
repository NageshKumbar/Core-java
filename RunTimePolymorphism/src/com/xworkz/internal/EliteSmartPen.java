package com.xworkz.internal;

public class EliteSmartPen extends SmartPen{
    public EliteSmartPen(){
        System.out.println("Running the EliteSmartPen const");
    }
    @Override
    public void usepen(){
        System.out.println("Running the overrided usepen in the subclass");
    }
    public void mainpen(){
        System.out.println("Running the mainpen method in the subclass");
    }
}
