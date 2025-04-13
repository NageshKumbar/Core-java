package com.xworkz.internal;

public class SavingsAccount extends Account {
    public void calculateInterest() {
        System.out.println("Calculating interest for savings account");
    }

    @Override
    public void deposit() {
        System.out.println("Money deposited in savings account");
    }
}
