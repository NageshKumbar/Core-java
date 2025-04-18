package com.xworkz.internal;

public class AI {
    final String field;
    final String application;
    public AI(String field, String application) {
        this.field = field;
        this.application = application;
    }
    @Override public String toString() {
        return "AI [field=" + field + ", application=" + application + "]";
    }
}
