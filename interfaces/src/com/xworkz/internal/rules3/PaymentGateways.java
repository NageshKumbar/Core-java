package com.xworkz.internal.rules3;

public interface PaymentGateways {
    void pay();
    void refund();
    void validate();
    void cancel();
    void status();
    void transactionHistory();
    void generateInvoice();
}