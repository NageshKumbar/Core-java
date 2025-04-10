package com.xworkz.internal;

public class ProRobotPet extends RobotPet{
    public ProRobotPet(){
        System.out.println("Running the ProRobotPet const");
    }
    @Override
    public void userobotpet(){
        System.out.println("running the userobotpet method in the subclass");
    }
    public void mainrobotpet(){
        System.out.println("Running the mainrobotpet method in the subclass");
    }
}
