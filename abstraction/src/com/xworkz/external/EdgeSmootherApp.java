package com.xworkz.external;

import com.xworkz.internal.EdgeFix;

public class EdgeSmootherApp {
    private EdgeFix edgeFix;

    public EdgeSmootherApp(EdgeFix edgeFix) {
        this.edgeFix = edgeFix;
    }

    public void smoothImageEdges() {
        System.out.println("Running smoothImageEdges in EdgeSmootherApp");
        if (edgeFix != null) {
            this.edgeFix.smoothEdges();
        } else {
            System.out.println("EdgeFix is null");
        }
    }
}