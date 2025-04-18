package com.xworkz.internal;

public class MachineLearning extends AI {
    public MachineLearning(String field, String application) {
        super(field, application);
    }
    @Override public String toString() {
        return "MachineLearning [field=" + field + ", application=" + application + "]";
    }
}