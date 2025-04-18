package com.xworkz.internal;

public class Drone extends Robotics {
    public Drone(String machine, String function) {
        super(machine, function);
    }
    @Override public String toString() {
        return "Drone [machine=" + machine + ", function=" + function + "]";
    }
}
