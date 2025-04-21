package com.xworkz.internal;

public abstract class Vehicle {
    String name;
    String model;
    public Vehicle(String name, String model){
        this.model=model;
        this.name=name;
    }
    public void info(){
        System.out.println("Name of the bike "+ name);
        System.out.println("Model of the bike "+model);
    }
}