package com.xworkz.internal;

public class Beverage {
    final String drink;
    final String temperature;
    public Beverage(String drink, String temperature) {
        this.drink = drink;
        this.temperature = temperature;
    }
    @Override public String toString() {
        return "Beverage [drink=" + drink + ", temperature=" + temperature + "]";
    }
}
