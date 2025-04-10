package com.xworkz.internal;

public class SmartTablet extends Tablet{
    public  SmartTablet(){
        System.out.println("Running smarttablet const");
    }
    @Override
    public void usetablet(){
        System.out.println("Running usetablet method in subclass");
    }
    public void maintablet(){
        System.out.println("Running maintablet method in subclass");
    }
}
