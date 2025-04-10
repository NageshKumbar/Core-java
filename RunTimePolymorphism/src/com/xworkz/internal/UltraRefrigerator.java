package com.xworkz.internal;

public class UltraRefrigerator extends Refrigerator{
    public UltraRefrigerator(){
        System.out.println("Running UltraRefrigerator cosnt ");
    }
    @Override
    public void useref(){
        System.out.println("Running useref method from subclass and parent class is Refrigerator");

    }
    public void maintainRef(){
        System.out.println("Running maintainref method in ultraRefrigerator");
    }
}
