package com.xworkz.internal;

public class EliteSmartLight extends SmartLight{
    void EliteSmartLight(){
        System.out.println("Running EliteSmartLight const ");
    }
    @Override
    public void usesmartlight(){
        System.out.println("Running the overided usesmartlight method in the subclass");
    }
    public void mainsmartlight(){
        System.out.println("Runnig mainsmartlight method in the subclass");
    }
}
