package com.xworkz.internal;

public class MaxCamera extends Camera{
    public MaxCamera(){
        System.out.println("no-arg subclass MaxCamera const is running ");
    }
    @Override
    public void usecamera(){
        System.out.println("no-arg overrided usecamera method is running in maxcamera and parent class is camera");
    }
    public void maitaincamera(){
        System.out.println("running maintaincamera method in the maxcamera subclass ");
    }
}
