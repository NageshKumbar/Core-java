package com.xworkz.internal;

public class SmartLaptop extends Laptop{
    public SmartLaptop(){
        System.out.println("no-arg Smartlaptop const is running");
    }
    @Override
    public void uselaptop(){
        System.out.println("Running overrided uselaptop method is running from subclass smartlaptop");

    }
    public void maintainlaptop(){
        System.out.println("Running maintainlaptop method form smartlaptop method");
    }
}
