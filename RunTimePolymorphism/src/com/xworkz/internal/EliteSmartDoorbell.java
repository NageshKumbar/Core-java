package com.xworkz.internal;


public class EliteSmartDoorbell extends  SmartDoorbell{
    void EliteSmartDoorbell(){
        System.out.println("running the EliteSmartDoorbell method in the parent class");
    }
    @Override
    public void usrdoorbell(){
        System.out.println("Running the usedoorbell method in the subclass");
    }
    public void maindoorbell(){
        System.out.println("Ruuning the maindoorbell method in the subclass");
    }
}
