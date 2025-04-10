package com.xworkz.internal;

public class MaxFitnessTracker extends  FitnessTracker{
    void MaxFitnessTracker(){
        System.out.println("Running the MaxFitnessTracker const");
    }
    @Override
    public void usetracker(){
        System.out.println("running the usetracker method in the subclass");
    }
    public void maintracker(){
        System.out.println("running the maintracker method in the subclass");
    }
}
