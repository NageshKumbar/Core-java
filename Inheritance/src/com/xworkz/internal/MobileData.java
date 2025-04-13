package com.xworkz.internal;

public class MobileData extends Services {
    public void checkUsage() {
        System.out.println("Checking data usage");
    }

    @Override
    public void connect() {
        System.out.println("Connecting mobile data");
    }
}