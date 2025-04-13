package com.xworkz.internal;

public class WeightLifting extends Exercise {
    public void increaseWeight() {
        System.out.println("Increasing weight");
    }
    @Override
    public void perform() {
        System.out.println("Lifting weights");
    }
}