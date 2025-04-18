package com.xworkz.internal;

public class Football extends Sport {
    public Football(String game, String equipment) {
        super(game, equipment);
    }
    @Override public String toString() {
        return "Football [game=" + game + ", equipment=" + equipment + "]";
    }
}
