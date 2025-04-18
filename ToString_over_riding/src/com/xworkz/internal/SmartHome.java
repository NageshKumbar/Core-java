package com.xworkz.internal;

public class SmartHome extends IoT {
    public SmartHome(String device, String connectivity) {
        super(device, connectivity);
    }
    @Override public String toString() {
        return "SmartHome [device=" + device + ", connectivity=" + connectivity + "]";
    }
}
