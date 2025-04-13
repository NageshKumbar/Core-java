package com.xworkz.internal;

public class Sink extends Fixture {
    public void connectPipes() {
        System.out.println("Connecting sink pipes");
    }

    @Override
    public void install() {
        System.out.println("Installing sink");
    }
}