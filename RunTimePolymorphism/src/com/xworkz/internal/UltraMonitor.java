package com.xworkz.internal;

public class UltraMonitor extends Monitor{
    public UltraMonitor(){
        System.out.println("Running the UltraMonitor const");
    }
    @Override
    public void usemonitor(){
        System.out.println("running the overrided usemonitor method in the subclass");
    }
    public void mainmonitor(){
        System.out.println("Running the mainmonitor method in the subclasss");
    }
}
