package com.xworkz.god.internal;

public class Wallet {

    Card card = new Card();

    public Wallet() {
        System.out.println("no-parameter const in Wallet");
        card.value();
    }
}
