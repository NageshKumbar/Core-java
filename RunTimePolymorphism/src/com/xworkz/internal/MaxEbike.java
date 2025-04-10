package com.xworkz.internal;

public class MaxEbike extends Ebike{
    public MaxEbike(){
        System.out.println("Ruuning the MaxEbike const");
    }
    @Override
    public void useebike(){
        System.out.println("Runninng the usebike method in the subclass");
    }
    public void mainebike(){
        System.out.println("Ruuning the mainebike method in the subclass");
    }
}
