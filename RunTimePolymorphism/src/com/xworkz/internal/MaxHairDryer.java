package com.xworkz.internal;

public class MaxHairDryer extends HairDryer {
    public MaxHairDryer(){
        System.out.println("Running the MaxHairDryer const");
    }
    @Override
    public void usehairdryer(){
        System.out.println("Ruuuning the usehairdryer method in the subclass");
    }
    public void mainhairdryer(){
        System.out.println("Running the mainhairdryer method in the subclass");
    }
}
