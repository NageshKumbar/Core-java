package com.xworkz.internal;

public class MaxDishwasher extends Dishwasher {
    public MaxDishwasher(){
        System.out.println("Running the MaxDishwasher in subclass");
    }
    @Override
    public void usedishwasher(){
        System.out.println("Running usedishwasher method in the subclass");

    }
    public void maindishwasher(){
        System.out.println("running the maindishwasher method in the subclass");
    }
}
