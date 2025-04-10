package com.xworkz.internal;

public class SmartBloodPressureMonitor extends BloodPressureMonitor {
    public SmartBloodPressureMonitor(){
        System.out.println("Running the SmartBloodPressureMonitor const");
    }
    @Override
    public void useblood(){
        System.out.println("Running the overided useblood method in subclass");
    }
    public void mainblood(){
        System.out.println("Running the mainblood method in the subclass");
    }
}
