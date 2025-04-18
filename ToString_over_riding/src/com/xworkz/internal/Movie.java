package com.xworkz.internal;

public class Movie {
    final String title;
    final String genre;
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    @Override public String toString() {
        return "Movie [title=" + title + ", genre=" + genre + "]";
    }
}
