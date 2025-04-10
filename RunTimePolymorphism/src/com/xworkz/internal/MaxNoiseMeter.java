package com.xworkz.internal;

public class MaxNoiseMeter extends NoiseMeter{
    public MaxNoiseMeter(){
        System.out.println("Runninge the MaxNoiseMeter const");
    }
    @Override
    public void usenoise(){
        System.out.println("Runnig the overrided usenoise method in the subclss");

    }
    public void mainnoise(){
        System.out.println("Running the mainnoise method in the subclass");
    }
}
