package com.xworkz.internal;

public class Bitcoin extends Blockchain {
    public Bitcoin(String name, String useCase) {
        super(name, useCase);
    }
    @Override public String toString() {
        return "Bitcoin [name=" + name + ", useCase=" + useCase + "]";
    }
}
