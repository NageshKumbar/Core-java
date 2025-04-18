package com.xworkz.internal;

public class Ecommerce extends Website {
    public Ecommerce(String name, String purpose) {
        super(name, purpose);
    }
    @Override public String toString() {
        return "Ecommerce [name=" + name + ", purpose=" + purpose + "]";
    }
}
