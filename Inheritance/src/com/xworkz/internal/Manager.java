package com.xworkz.internal;

public class Manager extends Employee {
    public void manageTeam() {
        System.out.println("Manager is managing team");
    }

    @Override
    public void work() {
        System.out.println("Manager is working on strategy");
    }
}