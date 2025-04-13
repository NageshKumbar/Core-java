package com.xworkz.internal;

public class Stock extends Investment {
    public void trade() {
        System.out.println("Trading stock");
    }

    @Override
    public void grow() {
        System.out.println("Stock value increasing");
    }
}
