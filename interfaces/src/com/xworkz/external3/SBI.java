package com.xworkz.external3;

import com.xworkz.internal.rules3.BankOperations;

public class SBI implements BankOperations {
    public void deposit() { System.out.println("Depositing money"); }
    public void withdraw() { System.out.println("Withdrawing money"); }
    public void checkBalance() { System.out.println("Checking balance"); }
    public void openAccount() { System.out.println("Opening account"); }
    public void closeAccount() { System.out.println("Closing account"); }
    public void applyLoan() { System.out.println("Applying for loan"); }
    public void getStatement() { System.out.println("Getting bank statement"); }
}