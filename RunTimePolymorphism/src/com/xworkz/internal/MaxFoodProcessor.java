package com.xworkz.internal;

public class MaxFoodProcessor extends FoodProcessor{
    public MaxFoodProcessor(){
        System.out.println("Running the MaxFoodProcessor const");
    }
    @Override
    public void usefood(){
        System.out.println("Running the usefood method in the subclass");
    }
    public void mainfood(){
        System.out.println("Running the mainfood method in the subclass");
    }
}
