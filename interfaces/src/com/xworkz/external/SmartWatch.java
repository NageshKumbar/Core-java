package com.xworkz.external;

import com.xworkz.internal.rules.SmartDevice;

public class SmartWatch implements SmartDevice {
    @Override
    public void powerOn() {
        System.out.println("running power on in Smart Watch");
    }
}
