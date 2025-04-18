package com.xworkz.internal;

public class Automation {
    final String tool;
    final String purpose;
    public Automation(String tool, String purpose) {
        this.tool = tool;
        this.purpose = purpose;
    }
    @Override public String toString() {
        return "Automation [tool=" + tool + ", purpose=" + purpose + "]";
    }
}