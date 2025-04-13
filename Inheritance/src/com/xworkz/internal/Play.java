package com.xworkz.internal;

public class Play extends Performance {
    public void rehearse() {
        System.out.println("Rehearsing play");
    }

    @Override
    public void present() {
        System.out.println("Presenting play");
    }
}