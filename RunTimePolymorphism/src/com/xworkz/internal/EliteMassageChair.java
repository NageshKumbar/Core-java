package com.xworkz.internal;

public class EliteMassageChair extends MassageChair{
    public EliteMassageChair(){
        System.out.println("Running the EliteMassageChair const");
    }
    @Override
    public void usemass(){
        System.out.println("Running the useamass method in the subclass");
    }
    public void mainmass(){
        System.out.println("Running the mainmass method in the subclass");
    }
}
