package com.xworkz.internal;

public class Coffee extends Beverage {
    public Coffee(String drink, String temperature) {
        super(drink, temperature);
    }
    @Override public String toString() {
        return "Coffee [drink=" + drink + ", temperature=" + temperature + "]";
    }
}