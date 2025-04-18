package com.xworkz.internal;

public class Reptile {
final String name;
final String environment;
public Reptile(String name, String environment) {
    this.name = name;
    this.environment = environment;
}
@Override public String toString() {
    return "Reptile [name=" + name + ", environment=" + environment + "]";
}
}
