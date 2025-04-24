package com.xworkz.external;

import com.xworkz.internal.Upscaler;

public class ImageUpscalerApp {
    private Upscaler upscaler;

    public ImageUpscalerApp(Upscaler upscaler) {
        this.upscaler = upscaler;
    }

    public void upscaleImage() {
        System.out.println("Running upscaleImage in ImageUpscalerApp");
        if (upscaler != null) {
            this.upscaler.upscale();
        } else {
            System.out.println("Upscaler is null");
        }
    }
}