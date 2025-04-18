package com.xworkz.internal;

public class Juice extends Drink {
    public Juice(String beverage, String flavor) {
        super(beverage, flavor);
    }
    @Override public String toString() {
        return "Juice [beverage=" + beverage + ", flavor=" + flavor + "]";
    }
}