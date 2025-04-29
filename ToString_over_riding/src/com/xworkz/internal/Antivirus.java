package com.xworkz.internal;

public class Antivirus extends Software {
    public Antivirus(String name, String function) {
        super(name, function);
    }
    @Override public String toString() {
        return "Antivirus [name=" + name + ", function=" + function + "]";
    }
}

