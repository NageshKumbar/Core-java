package com.xworkz.internal;

public class Manager extends Employee{

    @Override
    public void work() {
        System.out.println("running work in employee");
    }

    public void lead() {
        System.out.println("running lead in manager");
    }
}
