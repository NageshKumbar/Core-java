package com.xworkz.internal;

import java.util.Objects;

public class BoardGame {
    String name;
    int players;
    String ageRange;
    boolean cooperative;

    public BoardGame(String name, int players, String ageRange, boolean cooperative) {
        this.name = name;
        this.players = players;
        this.ageRange = ageRange;
        this.cooperative = cooperative;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Players = " + players + ", Age Range = " + ageRange + ", Cooperative = " + cooperative;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof BoardGame) {
            BoardGame game = (BoardGame) obj;
            if (Objects.equals(this.name, game.name) && Objects.equals(this.players, game.players) && Objects.equals(this.ageRange, game.ageRange) && Objects.equals(this.cooperative, game.cooperative)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}