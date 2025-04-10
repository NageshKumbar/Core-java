package com.xworkz.internal;

public class EliteGlucoseMonitor extends GlucoseMonitor{
    public EliteGlucoseMonitor(){
        System.out.println("Running the EliteGlucoseMonitor const");
    }
    @Override
    public void useglu(){
        System.out.println("Running the overrided useglu method in the subclass");
    }
    public void mainglu(){
        System.out.println("Running the mainglu method in the subglass");
    }
}
