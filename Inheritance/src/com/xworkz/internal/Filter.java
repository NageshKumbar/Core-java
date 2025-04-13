package com.xworkz.internal;

public class Filter extends System3 {
    public void backwash() {
        System.out.println("Backwashing filter");
    }

    @Override
    public void treat() {
        System.out.println("Filtering water");
    }
}
