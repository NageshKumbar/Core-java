package com.xworkz.internal;

public class Dollar extends Currency {
    public Dollar(String name, String country) {
        super(name, country);
    }
    @Override public String toString() {
        return "Dollar [name=" + name + ", country=" + country + "]";
    }
}