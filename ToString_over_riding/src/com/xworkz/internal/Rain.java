package com.xworkz.internal;

public class Rain extends Weather {
    public Rain(String condition, String season) {
        super(condition, season);
    }
    @Override public String toString() {
        return "Rain [condition=" + condition + ", season=" + season + "]";
    }
}
