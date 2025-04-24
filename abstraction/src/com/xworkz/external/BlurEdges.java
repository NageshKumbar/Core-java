package com.xworkz.external;

import com.xworkz.internal.EdgeFix;

public class BlurEdges implements EdgeFix {
    @Override
    public void smoothEdges() {
        System.out.println("Softening edges with Gaussian blur.");
    }
}

