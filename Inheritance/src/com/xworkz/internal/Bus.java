package com.xworkz.internal;

public class Bus extends Vehicle1 {
    public void announceStop() {
        System.out.println("Announcing bus stop");
    }

    @Override
    public void transport() {
        System.out.println("Transporting bus passengers");
    }
}