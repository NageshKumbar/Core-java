package com.xworkz.internal;

public class SmartTreadmill extends  Treadmill{
    public SmartTreadmill(){
        System.out.println("Running the SmartTreadmill const");
    }
    @Override
    public void usetread(){
        System.out.println("Running the usetread method in the subclass");
    }
    public void maintread(){
        System.out.println("Running the maintread method in the subclass");
    }
}
