package com.xworkz.external3;

import com.xworkz.internal.rules3.PaymentGateways;

public class Razorpays implements PaymentGateways {
    public void pay() { System.out.println("Payment done"); }
    public void refund() { System.out.println("Refund initiated"); }
    public void validate() { System.out.println("Validation done"); }
    public void cancel() { System.out.println("Payment cancelled"); }
    public void status() { System.out.println("Payment status checked"); }
    public void transactionHistory() { System.out.println("Transaction history fetched"); }
    public void generateInvoice() { System.out.println("Invoice generated"); }
}