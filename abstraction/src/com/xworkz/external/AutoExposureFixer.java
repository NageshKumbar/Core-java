package com.xworkz.external;

import com.xworkz.internal.Brightner;

public class AutoExposureFixer implements Brightner {
    @Override
    public void fixLighting() {
        System.out.println("Auto-adjusting exposure levels.");
    }
}
