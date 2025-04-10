package com.xworkz.internal;

public class EliteVRHeadset extends VRHeadset{
    public void EliteVRHeadset(){
        System.out.println("Running the EliteVRHeadset const");
    }
    @Override
    public void usehead(){
        System.out.println("Runninng the usehead method in the subclass");
    }
    public void mainhead(){
        System.out.println("Running the mainhead method in the subclass");
    }
}
