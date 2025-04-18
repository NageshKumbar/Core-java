package com.xworkz.internal;

public class Sport {
    final String game;
    final String equipment;
    public Sport(String game, String equipment) {
        this.game = game;
        this.equipment = equipment;
    }
    @Override public String toString() {
        return "Sport [game=" + game + ", equipment=" + equipment + "]";
    }
}
