package com.xworkz.internal;

public class Kick extends Technique {
    public void stretch() {
        System.out.println("Stretching for kick");
    }

    @Override
    public void perform() {
        System.out.println("Performing kick");
    }
}