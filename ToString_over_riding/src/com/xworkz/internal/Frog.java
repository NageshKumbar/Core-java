package com.xworkz.internal;

public class Frog extends Amphibian {
    public Frog(String species, String skin) {
        super(species, skin);
    }
    @Override public String toString() {
        return "Frog [species=" + species + ", skin=" + skin + "]";
    }
}
