package com.xworkz.internal;

public class MaxSmartphone extends SmartPhone{
    public MaxSmartphone(){
        System.out.println("no-args Maxsmartphone subclass is running");
    }
    @Override
    public void usesmartphone(){
        System.out.println("Running 0verided usesmartphone method from subclass and parent class is smartphone");

    }
    public void maintainsmartphone(){
        System.out.println("Running maintaingsmartphone method from maxsmartphone class");
    }
}
