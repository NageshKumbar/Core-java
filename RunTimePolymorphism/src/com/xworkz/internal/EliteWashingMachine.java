package com.xworkz.internal;

public class EliteWashingMachine extends WashingMachine{
    public EliteWashingMachine(){
        System.out.println("no-arg EliteWashingMachine subclass const is running");
    }
    @Override
    public void usewashmachine(){
        System.out.println("Running overrided use WashingMachine method form subclass in EliteWashingMachine and parent clas is WashingMachine ");

    }
    public void maintainwashingmachine(){
        System.out.println("Running maintainwashingmachine method is running from subclass Elitewashingamachine");
    }
}
