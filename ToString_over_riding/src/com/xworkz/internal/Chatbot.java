package com.xworkz.internal;

public class Chatbot extends Automation {
    public Chatbot(String tool, String purpose) {
        super(tool, purpose);
    }
    @Override public String toString() {
        return "Chatbot [tool=" + tool + ", purpose=" + purpose + "]";
    }
}
