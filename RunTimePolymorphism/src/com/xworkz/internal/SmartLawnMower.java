package com.xworkz.internal;

public class SmartLawnMower extends LawnMower{
    public SmartLawnMower(){
        System.out.println("running the SmartLawnMower const");
    }
    @Override
    public void uselawnmover(){
        System.out.println("Running the uselawnmover method in the subclass");
    }
    public void mainlawnover(){
        System.out.println("running teh mainlawnover method in the subclass");
    }
}
