package com.xworkz.internal;

public class SmartPOSMachine extends POSMachine{
    public SmartPOSMachine(){
        System.out.println("Running the SmartPOSMachine const");
    }
    @Override
    public void usemachine(){
        System.out.println("Runninng the usemachine in the subclass");
    }
    public void mainmachine(){
        System.out.println("Running the mainmachine in the subclass");
    }
}
