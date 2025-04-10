package com.xworkz.internal;

public class UltraAirPurifier extends AirPurifier{
    public UltraAirPurifier(){
        System.out.println("Running the UltraAirPurifier const");
    }
    @Override
    public void useair(){
        System.out.println("Running the useair method in the subclass");
    }
    public void mainair(){
        System.out.println("Runniing the mainair methoo in the subclass");
    }
}
