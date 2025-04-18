package com.xworkz.internal;

public class Action extends Movie {
    public Action(String title, String genre) {
        super(title, genre);
    }
    @Override public String toString() {
        return "Action [title=" + title + ", genre=" + genre + "]";
    }
}
