package com.xworkz.internal;

public class MaxWindowCleaner extends WindowCleaner{
    public MaxWindowCleaner(){
        System.out.println("Running the MaxWindowCleaner const");
    }
    @Override
    public void usewindow(){
        System.out.println("Running the overrided usewindow method in the subclass");
    }
    public void mainwindow(){
        System.out.println("Running the mainwindow method inn the sub class");
    }
}
