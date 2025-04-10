package com.xworkz.internal;

public class EliteDigitalMicroscope extends DigitalMicroscope{
    public EliteDigitalMicroscope(){
        System.out.println("Running the EliteDigitalMicroscope const");
    }

    @Override
    public void usedigital(){
        System.out.println("Running the usedigital method from subclass");
    }
    public void maindigital(){
        System.out.println("Running the maindigital method form subclass");
    }
}
