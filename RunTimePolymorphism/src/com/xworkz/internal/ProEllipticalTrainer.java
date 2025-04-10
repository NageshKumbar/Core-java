package com.xworkz.internal;

public class ProEllipticalTrainer extends EllipticalTrainer{
    public ProEllipticalTrainer(){
        System.out.println("Running ProEllipticalTrainer const");
    }
@Override
    public void useelli(){
    System.out.println("Runnning the useelli method in the subclass");
}
    public void mainelli(){
        System.out.println("Running the mainelli method in the subclass");
    }
}
