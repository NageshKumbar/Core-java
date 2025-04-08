package com.xworkz.god.internal;

public class Card {

    public Card() {
        System.out.println("no-parameter const of Card");
    }

    public void type() {
        System.out.println("running getType in Card");
    }

    void value() {
        System.out.println("running getValue in Card");
        color();
    }

    private void color() {
        System.out.println("running getColor in Card");
    }
}