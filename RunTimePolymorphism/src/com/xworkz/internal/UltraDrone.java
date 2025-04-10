package com.xworkz.internal;

public class UltraDrone extends Drone {
    public UltraDrone(){
        System.out.println("Running ultra Drone const");
    }
    @Override
    public void usedrone(){
        System.out.println("running usedrone method in the subclass");
    }
    public void maindrone(){
        System.out.println("running maindrone method in the subclass");
    }
}
