package com.xworkz.internal;

public class Blockchain {
    final String name;
    final String useCase;
    public Blockchain(String name, String useCase) {
        this.name = name;
        this.useCase = useCase;
    }
    @Override public String toString() {
        return "Blockchain [name=" + name + ", useCase=" + useCase + "]";
    }
}
