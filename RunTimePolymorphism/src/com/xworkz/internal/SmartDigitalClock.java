package com.xworkz.internal;

public class SmartDigitalClock extends DigitalClock{
    public SmartDigitalClock(){
        System.out.println("Running the SmartDigitalClock const");
    }
    @Override
    public void usedigital(){
        System.out.println("Running the usedigital method in the subclass");
    }
    public void maindigita(){
        System.out.println("Running the maindigital method in the subclass");
    }
}
