package com.xworkz.internal;

public class SmartGameConsole extends GameConsole{
    public SmartGameConsole(){
        System.out.println("Running the SmartGameConsole const");
    }
    @Override
    public void useconsole(){
        System.out.println("Running the overrided useconsole method in the subclass");
    }
    public void mainconsole(){
        System.out.println("Running the mainconsole method in the subclass");
    }
}
