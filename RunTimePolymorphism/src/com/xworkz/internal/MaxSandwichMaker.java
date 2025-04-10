package com.xworkz.internal;

public class MaxSandwichMaker extends SandwichMaker{
    public MaxSandwichMaker(){
        System.out.println("Running the MaxSandwichMaker cosnt");
    }
    @Override
    public void usesand(){
        System.out.println("Running teh usesand method in the subclass");

    }
    public void mainand(){
        System.out.println("Running the mainand method in the subclass");
    }
}
