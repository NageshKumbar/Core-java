package com.xworkz.external;

import com.xworkz.internal.TextClean;

public class ManualTextRefiner implements TextClean {
    @Override
    public void clearText() {
        System.out.println("Manually refining text edges.");
    }
}