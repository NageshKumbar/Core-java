package com.xworkz.internal;

public class AR {
    final String tech;
    final String use;
    public AR(String tech, String use) {
        this.tech = tech;
        this.use = use;
    }
    @Override public String toString() {
        return "AR [tech=" + tech + ", use=" + use + "]";
    }
}
