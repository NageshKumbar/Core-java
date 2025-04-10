package com.xworkz.internal;

public class ProBluetoothTracker extends BluetoothTracker{
    public ProBluetoothTracker(){
        System.out.println("Running the ProBluetoothTracker const");
    }
    @Override
    public void useblue(){
        System.out.println("Ruuning overrided useblue method in the subclass");
    }
    public void mainblue(){
        System.out.println("Running the mainblue method in the subclass");
    }
}
