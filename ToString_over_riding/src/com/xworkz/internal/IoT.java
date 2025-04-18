package com.xworkz.internal;

public class IoT {
    final String device;
    final String connectivity;
    public IoT(String device, String connectivity) {
        this.device = device;
        this.connectivity = connectivity;
    }
    @Override public String toString() {
        return "IoT [device=" + device + ", connectivity=" + connectivity + "]";
    }
}