package com.xworkz.internal;

public class SmartElectricGrill extends ElectricGrill{
    public SmartElectricGrill(){
        System.out.println("Running the SmartElectricGrill const");

    }
    @Override
    public void useele(){
        System.out.println("Ruuning the useele method in the subclass");
    }
    public void mainele(){
        System.out.println("Running the mainele method inn the subclass");
    }
}
