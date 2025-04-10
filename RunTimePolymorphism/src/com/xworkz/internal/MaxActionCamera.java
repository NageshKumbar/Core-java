package com.xworkz.internal;

public class MaxActionCamera extends ActionCamera {
    public MaxActionCamera(){
        System.out.println("Running the MaxActionCamera const");
    }
    @Override
    public void useaction(){
        System.out.println("Running the useaction method in the subclass");
    }
    public void mainaction(){
        System.out.println("Running the mainaction method inn the subclass");

    }
}
