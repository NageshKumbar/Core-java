package com.xworkz.internal;

public class Tent extends Gear {
    public void stakeDown() {
        System.out.println("Staking down tent");
    }

    @Override
    public void setup() {
        System.out.println("Pitching tent");
    }
}