package com.xworkz.external;

import com.xworkz.internal.EdgeFix;

public class AntiAliaser implements EdgeFix {
    @Override
    public void smoothEdges() {
        System.out.println("Reducing jagged edges with anti-aliasing.");
    }
}
