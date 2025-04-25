package com.xworkz.external;

import com.xworkz.internal.Upscaler;

public class SimpleUpscaler implements Upscaler {
    @Override
    public void upscale() {
        System.out.println("2x upscaling using interpolation.");
    }
}
