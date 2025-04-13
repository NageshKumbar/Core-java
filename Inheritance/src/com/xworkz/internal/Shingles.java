package com.xworkz.internal;

public class Shingles extends Materials {
    public void nailDown() {
        System.out.println("Nailing down shingles");
    }

    @Override
    public void install() {
        System.out.println("Installing shingles");
    }
}
