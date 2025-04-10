package com.xworkz.internal;

public class SmartSmartLock extends SmartLock {
    public SmartSmartLock(){
        System.out.println("Running the SmartSmartLock const");
    }
    @Override
    public void uselock(){
        System.out.println("Running the uslock method in the subclass");
    }
    public void mainlock(){
        System.out.println("Running the mainlock method in the subclass");
    }
}
