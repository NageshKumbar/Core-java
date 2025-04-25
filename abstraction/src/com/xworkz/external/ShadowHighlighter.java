package com.xworkz.external;

import com.xworkz.internal.Brightner;

public class ShadowHighlighter implements Brightner {
    @Override
    public void fixLighting() {
        System.out.println("Brightening shadows while preserving highlights.");
    }
}