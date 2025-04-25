package com.xworkz.external;

import com.xworkz.internal.TextClean;

public class TextRefinerApp {
    private TextClean textClean;

    public TextRefinerApp(TextClean textClean) {
        this.textClean = textClean;
    }

    public void refineText() {
        System.out.println("Running refineText in TextRefinerApp");
        if (textClean != null) {
            this.textClean.clearText();
        } else {
            System.out.println("TextClean is null");
        }
    }
}