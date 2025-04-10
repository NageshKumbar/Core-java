package com.xworkz.internal;

public class UltraDronePro extends DronePro{
    public UltraDronePro(){
        System.out.println("Running the UltraDronepro const ");
    }
    @Override
    public void usedrone(){
        System.out.println("Running the overrided usedrone method in subclass");
    }
    public void maindrone(){
        System.out.println("Running the maindrone method in the subclass");
    }
}
