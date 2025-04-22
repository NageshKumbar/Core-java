package com.xworkz.external2;

import com.xworkz.internal.rules2.PaymentGateway;

public class Razorpay implements PaymentGateway {
    public void pay() {
        System.out.println("Payment done");
    }
    public void refund() {
        System.out.println("Refund initiated");
    }
    public void validate() {
        System.out.println("Validation done");
    }
    public void cancel() {
        System.out.println("Payment cancelled");
    }
    public void status() {
        System.out.println("Payment status checked");
    }
}