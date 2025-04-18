package com.xworkz.internal;

public class Currency {
    final String name;
    final String country;
    public Currency(String name, String country) {
        this.name = name;
        this.country = country;
    }
    @Override public String toString() {
        return "Currency [name=" + name + ", country=" + country + "]";
    }
}