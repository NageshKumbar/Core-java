package com.xworkz.external1;

import com.xworkz.internal.rules1.Camera;

public class DSLRCamera implements Camera {
    @Override
    public void capture() {
        System.out.println("Running capture in DSLR camera");
    }

    @Override
    public void record() {
        System.out.println("Running record in Dslr camera");
    }

    @Override
    public void zoomIn() {
        System.out.println("Running zoom In in DSLR");
    }
}
