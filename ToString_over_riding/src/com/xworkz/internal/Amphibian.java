package com.xworkz.internal;

public class Amphibian {
    final String species;
    final String skin;
    public Amphibian(String species, String skin) {
        this.species = species;
        this.skin = skin;
    }
    @Override public String toString() {
        return "Amphibian [species=" + species + ", skin=" + skin + "]";
    }
}
