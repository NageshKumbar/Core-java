package com.xworkz.internal;

public class MaxSoundbar extends Soundbar{
    public MaxSoundbar(){
        System.out.println("Running the MaxSoundbar const");
    }
    @Override
    public void usesounde(){
        System.out.println("Running the usesounde method in the subclass");

    }
    public void mainsounder(){
        System.out.println("Running the mainsounder method in the subclass");
    }
}
