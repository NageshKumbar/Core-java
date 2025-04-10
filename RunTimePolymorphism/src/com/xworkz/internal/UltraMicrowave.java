package com.xworkz.internal;

public class UltraMicrowave extends Microwave{
    public UltraMicrowave(){
        System.out.println("Running ultraMicrowave subclass cosnt");
    }

    @Override
    public void usemicrowave() {
        System.out.println("Runniing overrided usemicrowave method in subclass");
    }
    public void maintainmicrowave(){
        System.out.println("Running maintainmicrowave method is running in the subclass");
    }
}
