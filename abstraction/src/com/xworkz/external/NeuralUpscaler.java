package com.xworkz.external;

import com.xworkz.internal.Upscaler;

public class NeuralUpscaler implements Upscaler {
    @Override
    public void upscale() {
        System.out.println("4x upscaling with deep learning.");
    }
}
