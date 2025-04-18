package com.xworkz.internal;

public class Storage extends Cloud {
    public Storage(String service, String provider) {
        super(service, provider);
    }
    @Override public String toString() {
        return "Storage [service=" + service + ", provider=" + provider + "]";
    }
}
