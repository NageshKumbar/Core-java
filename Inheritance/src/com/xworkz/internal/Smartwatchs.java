package com.xworkz.internal;

public class Smartwatchs extends Watch {
    public void checkNotifications() {
        System.out.println("Checking notifications");
    }

    @Override
    public void tellTime() {
        System.out.println("Displaying digital time");
    }
}