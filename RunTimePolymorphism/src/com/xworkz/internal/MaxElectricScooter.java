package com.xworkz.internal;

public class MaxElectricScooter extends ElectricScooter{
    public MaxElectricScooter(){
        System.out.println("Running the MaxElectricScooter const");
    }
    @Override
    public void usescooter(){
        System.out.println("Running the overrided usecooter method in the subclass");
    }
    public void mainscooter(){
        System.out.println("Running the overrided mainscooter nethod in the subclass");
    }
}
