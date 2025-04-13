package com.xworkz.internal;

public class PackageDelivery extends Service1 {
    public void scanBarcode() {
        System.out.println("Scanning package barcode");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering package");
    }
}