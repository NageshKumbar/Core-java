package com.xworkz.internal;

public class Language {
    final String name;
    final String family;
    public Language(String name, String family) {
        this.name = name;
        this.family = family;
    }
    @Override public String toString() {
        return "Language [name=" + name + ", family=" + family + "]";
    }
}
