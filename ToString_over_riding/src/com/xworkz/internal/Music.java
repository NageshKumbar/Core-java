package com.xworkz.internal;

public class Music {
    final String genre;
    final String instrument;
    public Music(String genre, String instrument) {
        this.genre = genre;
        this.instrument = instrument;
    }
    @Override public String toString() {
        return "Music [genre=" + genre + ", instrument=" + instrument + "]";
    }
}
