package com.xworkz.internal;

public class Drink {
    final String beverage;
    final String flavor;
    public Drink(String beverage, String flavor) {
        this.beverage = beverage;
        this.flavor = flavor;
    }
    @Override public String toString() {
        return "Drink [beverage=" + beverage + ", flavor=" + flavor + "]";
    }
}
