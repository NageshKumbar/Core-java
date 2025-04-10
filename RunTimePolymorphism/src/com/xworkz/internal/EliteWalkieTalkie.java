package com.xworkz.internal;

public class EliteWalkieTalkie extends WalkieTalkie{
    public EliteWalkieTalkie(){
        System.out.println("Running the EliteWalkieTalkie const");
    }
    @Override
    public void usewalk(){
        System.out.println("Running the usewalk method in the subclass");
    }
    public void mainwalk(){
        System.out.println("Running the mainwalk method in the subclass");
    }
}
