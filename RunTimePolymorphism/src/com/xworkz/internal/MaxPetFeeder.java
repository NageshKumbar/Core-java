package com.xworkz.internal;

public class MaxPetFeeder extends PetFeeder{
    public MaxPetFeeder(){
        System.out.println("Running the MaxPetFeeder const");
    }
    @Override
    public void usefeed(){
        System.out.println("Runnig the overrided usefeed method in the subclass");
    }
    public void mainfeed(){
        System.out.println("Running the mainfeed method in the subclass");
    }
}
