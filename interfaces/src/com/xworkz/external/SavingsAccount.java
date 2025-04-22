package com.xworkz.external;

import com.xworkz.internal.rules.BankAccount;

public class SavingsAccount implements BankAccount {
    @Override
    public void deposite() {
        System.out.println("Running depo in Savings Account");
    }
}
