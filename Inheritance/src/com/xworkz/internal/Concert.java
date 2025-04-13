package com.xworkz.internal;

public class Concert extends Show {
    public void playEncore() {
        System.out.println("Playing encore performance");
    }

    @Override
    public void perform() {
        System.out.println("Performing live concert");
    }
}
