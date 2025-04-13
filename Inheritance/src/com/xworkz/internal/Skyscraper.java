package com.xworkz.internal;

public class Skyscraper extends Building {
    public void installElevator() {
        System.out.println("Installing elevator");
    }

    @Override
    public void construct() {
        System.out.println("Constructing skyscraper");
    }
}
