package com.xworkz.internal;

public class Job {
    final String position;
    final String field;
    public Job(String position, String field) {
        this.position = position;
        this.field = field;
    }
    @Override public String toString() {
        return "Job [position=" + position + ", field=" + field + "]";
    }
}
