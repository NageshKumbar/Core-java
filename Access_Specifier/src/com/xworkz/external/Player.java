package com.xworkz.god.external;

import com.xworkz.god.internal.Card;

public class Player {

    Card card = new Card();

    public Player() {
        System.out.println("no-parameter const of Player");
        card.type();
    }
}
