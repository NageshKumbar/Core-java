package com.xworkz.internal;

public class Guitar extends Instrument {
    public void tuneStrings() {
        System.out.println("Tuning guitar strings");
    }

    @Override
    public void play() {
        System.out.println("Strumming guitar");
    }
}