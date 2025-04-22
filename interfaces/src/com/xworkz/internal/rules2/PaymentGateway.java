package com.xworkz.internal.rules2;

public interface PaymentGateway {
    void pay();
    void refund();
    void validate();
    void cancel();
    void status();
}