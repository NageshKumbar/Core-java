package com.xworkz.internal;

public class Art {
    final String form;
    final String medium;
    public Art(String form, String medium) {
        this.form = form;
        this.medium = medium;
    }
    @Override public String toString() {
        return "Art [form=" + form + ", medium=" + medium + "]";
    }
}
