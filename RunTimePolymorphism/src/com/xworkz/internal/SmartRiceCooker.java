package com.xworkz.internal;

public class SmartRiceCooker extends  RiceCooker{
    public SmartRiceCooker(){
        System.out.println("Running the SmartRiceCooker cosnt");
    }
    @Override
    public void userice(){
        System.out.println("Running the userice method in the subclass");
    }
    public void mainrice(){
        System.out.println("Running the mainrice method in the subclass");
    }
}
