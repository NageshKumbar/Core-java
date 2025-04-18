package com.xworkz.internal;

public class VR {
    final String technology;
    final String application;
    public VR(String technology, String application) {
        this.technology = technology;
        this.application = application;
    }
    @Override public String toString() {
        return "VR [technology=" + technology + ", application=" + application + "]";
    }
}