package com.xworkz.internal;

public class MaxWaterPurifier extends WaterPurifier {
    public MaxWaterPurifier(){
        System.out.println("Running the MaxWaterPurifier const");
    }
    @Override
    public void usepurifier(){
        System.out.println("Running the usepurifier method in the subclasss");
    }
    public void mainpurifier(){
        System.out.println("Running the mainpurifier method in the subclass");
    }
}
