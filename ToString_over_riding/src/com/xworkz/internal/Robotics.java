package com.xworkz.internal;

public class Robotics {
    final String machine;
    final String function;
    public Robotics(String machine, String function) {
        this.machine = machine;
        this.function = function;
    }
    @Override public String toString() {
        return "Robotics [machine=" + machine + ", function=" + function + "]";
    }
}
