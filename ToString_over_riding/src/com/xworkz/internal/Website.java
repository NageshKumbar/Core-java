package com.xworkz.internal;

public class Website {
    final String name;
    final String purpose;
    public Website(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }
    @Override public String toString() {
        return "Website [name=" + name + ", purpose=" + purpose + "]";
    }
}
