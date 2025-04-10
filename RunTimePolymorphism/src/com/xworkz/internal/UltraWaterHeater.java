package com.xworkz.internal;

public class UltraWaterHeater extends WaterHeater{
    public UltraWaterHeater(){
        System.out.println("Running the UltraWaterHeater const");
    }
    @Override
    public void water(){
        System.out.println("Running the water method in the subclass");
    }
    public void mainwater(){
        System.out.println("Running the mainwater method in the subclass");
    }
}
