package com.xworkz.internal;

public class Yacht extends Vessel {
    public void anchor() {
        System.out.println("Anchoring yacht");
    }

    @Override
    public void sail() {
        System.out.println("Yacht cruising");
    }
}