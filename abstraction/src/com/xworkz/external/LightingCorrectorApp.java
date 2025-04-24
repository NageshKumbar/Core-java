package com.xworkz.external;

import com.xworkz.internal.Brightner;

public class LightingCorrectorApp {
    private Brightner brightner;

    public LightingCorrectorApp(Brightner brightner) {
        this.brightner = brightner;
    }

    public void correctLighting() {
        System.out.println("Running correctLighting in LightingCorrectorApp");
        if (brightner != null) {
            this.brightner.fixLighting();
        } else {
            System.out.println("Brightner is null");
        }
    }
}