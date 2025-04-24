package com.xworkz.external;

import com.xworkz.internal.TextClean;

public class OCRCleaner implements TextClean {
    @Override
    public void clearText() {
        System.out.println("Using OCR to sharpen and clean text.");
    }
}

