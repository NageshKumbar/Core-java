package com.xworkz.internal;

public class Coffee extends Drink {
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void consume() {
        System.out.println("Drinking coffee");
    }
}
