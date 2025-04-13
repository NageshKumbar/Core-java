package com.xworkz.internal;

public class Spin extends Move {
    public void spot() {
        System.out.println("Spotting during spin");
    }

    @Override
    public void execute() {
        System.out.println("Executing spin");
    }
}