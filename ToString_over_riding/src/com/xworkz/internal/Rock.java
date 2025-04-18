package com.xworkz.internal;

public class Rock extends Music {
    public Rock(String genre, String instrument) {
        super(genre, instrument);
    }
    @Override public String toString() {
        return "Rock [genre=" + genre + ", instrument=" + instrument + "]";
    }
}