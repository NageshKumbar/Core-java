package com.xworkz.internal;

public class Magazine extends Publication {
    public void flipPages() {
        System.out.println("Flipping magazine pages");
    }

    @Override
    public void publish() {
        System.out.println("Publishing magazine issue");
    }
}