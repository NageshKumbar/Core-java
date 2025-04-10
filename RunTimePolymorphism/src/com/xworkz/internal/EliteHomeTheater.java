package com.xworkz.internal;

public class EliteHomeTheater extends HomeTheater{
    public EliteHomeTheater(){
        System.out.println("Running the EliteHomeTheater const");
    }
    @Override
    public void usetheater(){
        System.out.println("Running the usetheater method in the subclass");
    }
    public void maintheater(){
        System.out.println("Running the maintheater method in the subclass");
    }
}
