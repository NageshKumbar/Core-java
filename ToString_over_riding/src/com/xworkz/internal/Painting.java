package com.xworkz.internal;

public class Painting extends Art {
    public Painting(String form, String medium) {
        super(form, medium);
    }
    @Override public String toString() {
        return "Painting [form=" + form + ", medium=" + medium + "]";
    }
}
