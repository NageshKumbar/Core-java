package com.xworkz.internal;

public class ProECGMonitor extends ECGMonitor{
    public ProECGMonitor(){
        System.out.println("Running the ProECGMonitor const");
    }
    @Override
    public void useecg(){
        System.out.println("Running the overrided useecg method in the subclass");
    }
    public void mainecg(){
        System.out.println("Running the mainecg method in the subclass");
    }
}
