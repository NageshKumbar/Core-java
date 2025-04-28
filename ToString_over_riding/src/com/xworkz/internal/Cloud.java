package com.xworkz.internal;

public class Cloud {
    final String service;
    final String provider;
    public Cloud(String service, String provider) {
        this.service = service;
        this.provider = provider;
    }
    @Override public String toString() {
        return "Cloud [service=" + service + ", provider=" + provider + "]";
    }
}