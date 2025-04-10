package com.xworkz.internal;

public class SmartFan extends Fan {
    public SmartFan(){
        System.out.println("running the SmartFan const");
    }
    @Override
    public void usefan(){
        System.out.println("Running the usefan method in the subclass");
    }
    public void mainfan(){
        System.out.println("Running the mainfan method in the subclass");
    }
}
