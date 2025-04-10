package com.xworkz.internal;

public class UltraDashCam extends DashCam{
    public UltraDashCam(){
        System.out.println("Runninng the UltraDashCam const");
    }
    @Override
    public void usedash(){
        System.out.println("Running the usedash method in the method in the subclass");
    }
    public void maindash(){
        System.out.println("Runninng the maindash method in the method in the subclass");
    }
}
