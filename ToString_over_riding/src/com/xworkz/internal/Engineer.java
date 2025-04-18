package com.xworkz.internal;

public class Engineer extends Job {
    public Engineer(String position, String field) {
        super(position, field);
    }
    @Override public String toString() {
        return "Engineer [position=" + position + ", field=" + field + "]";
    }
}
