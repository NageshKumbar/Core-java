package com.xworkz.external2;

import com.xworkz.internal.rules2.ECommerce;

public class Amazon implements ECommerce {
    public void browse() {
        System.out.println("Browsing products");
    }
    public void addToCart() {
        System.out.println("Product added to cart");
    }
    public void checkout() {
        System.out.println("Checkout completed");
    }
    public void trackOrder() {
        System.out.println("Tracking order");
    }
    public void returnItem() {
        System.out.println("Returning item");
    }
}