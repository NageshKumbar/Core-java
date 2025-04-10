package com.xworkz.internal;

public class UltraElectricBlanket extends ElectricBlanket {
    public UltraElectricBlanket(){
        System.out.println("Running the UltraElectricBlanket const");
    }
    @Override
    public void useele(){
        System.out.println("Running the useele method in subclass");
    }
    public void mainele(){
        System.out.println("Running the mainele method in subclass");
    }
}
