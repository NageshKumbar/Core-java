package com.xworkz.god.internal;

public class Drone {
    public Drone(){
        System.out.println("No arg const");
    }
    public void sky(){
        System.out.println("public method of Drone");
    }
    void wings(){
        System.out.println("package-default method of Drone");
        fly();
    }
    private void fly(){
        System.out.println("private method of Drone");
    }
}
